plugins {
    kotlin("jvm") version "1.9.0"
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

    // WebDriverManager
    testImplementation("io.github.bonigarcia:webdrivermanager:5.6.2")

    // Cucumber
    testImplementation("io.cucumber:cucumber-java:7.14.0")
    testImplementation("io.cucumber:cucumber-junit:7.14.0")
    testImplementation("io.cucumber:cucumber-junit-platform-engine:7.14.0")

    // JUnit 4 & 5
    testImplementation("junit:junit:4.13.2")
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.2")

    // Cucumber Reporting
    testImplementation("net.masterthought:cucumber-reporting:5.7.4")

    // Logging
    testImplementation("org.apache.logging.log4j:log4j-core:2.19.0")

    // Serenity Dependencies (Manual Addition)
    testImplementation("net.serenity-bdd:serenity-core:3.6.21")
    testImplementation("net.serenity-bdd:serenity-junit5:3.6.21")
    testImplementation("net.serenity-bdd:serenity-cucumber:3.6.21")
}


tasks.test {
    useJUnit() // Use JUnit 4. If using JUnit 5, change to useJUnitPlatform()
    testLogging {
        events("passed", "skipped", "failed")
    }
}
