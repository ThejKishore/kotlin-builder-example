import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

val kotlinBuilderVersion ="1.2.1"

buildscript {
    repositories{
        maven {
            url = uri("https://plugins.gradle.org/m2/")
        }
        mavenCentral()
    }
}

plugins {
    kotlin("jvm") version "1.6.0"
    id("org.jetbrains.kotlin.kapt") version "1.6.0"
    id("com.google.devtools.ksp") version "1.6.0-1.0.2"
}

group = "me.thej"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.thinkinglogic.builder:kotlin-builder-annotation:${kotlinBuilderVersion}")
    kapt("com.thinkinglogic.builder:kotlin-builder-processor:${kotlinBuilderVersion}")
    //Validatin in Kotlin
    implementation("io.konform:konform-jvm:0.3.0")

    implementation(platform("io.arrow-kt:arrow-stack:1.0.1"))
    implementation("io.arrow-kt:arrow-core")
    implementation("io.arrow-kt:arrow-optics")
    kapt("io.arrow-kt:arrow-meta")
    ksp("io.arrow-kt:arrow-optics-ksp-plugin:1.0.1")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnit()
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}