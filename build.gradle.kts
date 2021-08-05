import org.jetbrains.compose.compose
import org.jetbrains.compose.desktop.application.dsl.TargetFormat
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile


plugins {
    kotlin("jvm") version "1.4.30"
    id("org.jetbrains.compose") version "0.3.1"
}

group = "me.langb"
version = "1.0"

repositories {
    jcenter()
    mavenCentral()
    maven { url = uri("https://maven.pkg.jetbrains.space/public/p/compose/dev") }
}

dependencies {
    testImplementation(kotlin("test-junit"))
    implementation("io.ktor:ktor-client-json:1.6.2")
    implementation("io.ktor:ktor-client-serialization:1.6.2")
    implementation("io.ktor:ktor-client-jackson:1.6.2")
    implementation("io.ktor:ktor-client-core:1.6.2")
    implementation("io.ktor:ktor-client-cio:1.6.2")
    implementation("io.ktor:ktor-client-gson:1.6.2")
    implementation(compose.desktop.currentOs)
}

tasks.test {
    useJUnit()
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "11"
}

compose.desktop {
    application {
        mainClass = "MainKt"
        nativeDistributions {
            targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb)
            packageName = "bilibili"
            packageVersion = "1.0.0"
        }
    }
}