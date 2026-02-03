plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
}

private val openrndrVersion = libs.versions.openrndr.get()
private fun openrndr(module: String) = "org.openrndr:openrndr-$module:$openrndrVersion"

android {
    namespace = "org.openrndr.android.demo"
    compileSdk = 36

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
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

    kotlin {
        jvmToolchain(21)
    }
}

dependencies {
    implementation(openrndr("application"))
    implementation(openrndr("android"))
    implementation(openrndr("color"))

    implementation(libs.androidx.core.ktx)
}