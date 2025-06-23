plugins {
    kotlin("jvm") version "2.2.0"
    application
}

group = "dev.bcmedeiros"
version = "0.0.1-SNAPSHOT"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("reflect"))
}

kotlin {
    compilerOptions {
        freeCompilerArgs.addAll("-Xjsr305=strict")
        freeCompilerArgs.addAll("-Xcontext-parameters")
    }
}

application {
    mainClass.set("dev.bcmedeiros.kt78442.MainKt")
}