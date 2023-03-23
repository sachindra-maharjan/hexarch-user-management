plugins {
    // Apply the application plugin to add support for building a CLI application in Java.
    application
    id("org.jetbrains.kotlin.plugin.lombok") version "1.5.20-RC"
}

dependencies {
    implementation("com.google.guava:guava:31.1-jre")
    compileOnly("org.projectlombok:lombok:1.18.26")
    annotationProcessor("org.projectlombok:lombok:1.18.26")
}

application {
    // Define the main class for the application.
    mainClass.set("com.yeti.hexarch.usermgmt.domain.App")
}
