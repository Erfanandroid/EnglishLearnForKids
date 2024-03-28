

plugins {
    alias(libs.plugins.androidApplication)
    id ("org.jetbrains.kotlin.android")
    id("com.google.dagger.hilt.android")
    id ("com.google.devtools.ksp")
}

android {
    namespace = "com.example.englishlearnforkids"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.englishlearnforkids"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }


    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.11"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)


    //dagger hilt
    implementation (libs.androidx.hilt.navigation.compose)
    implementation (libs.hilt.android.v2481)
    ksp(libs.dagger.compiler)
    ksp(libs.hilt.android.compiler.v2481)

    // Dagger - Hilt
    implementation (libs.hilt.android)
    ksp (libs.androidx.hilt.compiler)


    //navigation

    implementation (libs.androidx.navigation.compose)


    // Room
    implementation (libs.room.runtime)
    ksp (libs.androidx.room.compiler)


    // Kotlin Extensions and Coroutines support for Room
    implementation (libs.androidx.room.ktx)



    // Coroutines
    implementation (libs.kotlinx.coroutines.core)
    implementation (libs.kotlinx.coroutines.android)

    // Coroutine Lifecycle Scopes
    implementation (libs.androidx.lifecycle.viewmodel.ktx)
    implementation (libs.androidx.lifecycle.runtime.ktx)

    implementation (libs.androidx.runtime.livedata)

    // Retrofit
    implementation (libs.retrofit)
    implementation (libs.converter.gson)
    implementation (libs.logging.interceptor)

    // Glide
    implementation (libs.glide)
    ksp (libs.glide.compiler)


}