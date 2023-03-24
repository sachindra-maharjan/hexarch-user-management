plugins {
    // Apply the application plugin to add support for building a CLI application in Java.
    application
    
}

dependencies {
    implementation("com.google.guava:guava:31.1-jre")
}

application {
    // Define the main class for the application.
    mainClass.set("com.yeti.hexarch.usermgmt.domain.App")
}

testing {
    suites {
        // Configure the built-in test suite
        val test by getting(JvmTestSuite::class) {
            // Use JUnit Jupiter test framework
            useJUnitJupiter("5.9.1")
        }
    }
}