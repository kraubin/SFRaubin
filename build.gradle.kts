plugins {
    id("java")
}



group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // Selenium Java
    testImplementation("org.seleniumhq.selenium:selenium-java:4.14.1")

    // WebDriverManager for automatic browser driver setup
    testImplementation("io.github.bonigarcia:webdrivermanager:5.6.2")

    // Cucumber Java
    testImplementation("io.cucumber:cucumber-java:7.14.0")

    // Cucumber JUnit (for running tests with JUnit 4)
    testImplementation("io.cucumber:cucumber-junit:7.14.0")

    // JUnit 4 (if using Cucumber JUnit 4 Runner)
    testImplementation("junit:junit:4.13.2")

    // JUnit 5 (if using JUnit 5 with Cucumber)
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.2")
    testImplementation("io.cucumber:cucumber-junit-platform-engine:7.14.0")

    // Cucumber Reporting (Optional)
    testImplementation("net.masterthought:cucumber-reporting:5.7.4")

    // Logging (Optional)
    testImplementation("org.apache.logging.log4j:log4j-core:2.19.0")

}

tasks.test {
    useJUnit() // Use JUnit 4. If using JUnit 5, change to useJUnitPlatform()
    testLogging {
        events("passed", "skipped", "failed")
    }
}
