plugins {
    id("java-library")
    id("kotlin")
    `kotlin-dsl`
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
    withJavadocJar()
    withSourcesJar()
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(Dependencies.gson)
    testImplementation(Dependencies.kotlinTest)
}
