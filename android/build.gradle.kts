plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

buildscript {
    val kotlin_version = "1.9.0"
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:8.10.0")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${kotlin_version}")
    }
}

group = "com.originoss.flutter_html_to_pdf_plus"
version = "1.0-SNAPSHOT"

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

android {
    namespace = "com.originoss.flutter_html_to_pdf_plus"
    compileSdk = 36

    defaultConfig {
        minSdk = 19
    }

    compileOptions {
        sourceCompatibility = org.gradle.api.JavaVersion.VERSION_17
        targetCompatibility = org.gradle.api.JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }

    sourceSets {
        named("main") {
            java {
                srcDir("src/main/kotlin")
            }
        }
        named("test") {
            java {
                srcDir("src/test/kotlin")
            }
        }
    }

    testOptions {
        unitTests {
            all {
                it.useJUnitPlatform()
            }
        }
    }
}


dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation("org.mockito:mockito-core:5.0.0")
}
