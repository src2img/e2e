plugins {
    id("org.jetbrains.kotlin.jvm") version "1.6.21"
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.google.guava:guava:31.0.1-jre")
    implementation("commons-io:commons-io:2.11.0")
}

application {
    mainClass.set("com.ibm.cloud.codeengine.test.AppKt")
}
