plugins {
    java
}

group = "daij"

version = "1.0.0"

repositories {
    jcenter()
}

dependencies {
    implementation(group = "org.jetbrains", name = "annotations", version = "20.1.0")
    // Use JUnit Jupiter API for testing.
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.2")

    // Use JUnit Jupiter Engine for testing.
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks.test {
    // Use junit platform for unit tests.
    useJUnitPlatform()
}