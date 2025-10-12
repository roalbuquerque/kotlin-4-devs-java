plugins {
    kotlin("jvm") version "2.2.0"
}

group = "br.com.albuquerque"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    testImplementation ("org.junit.jupiter:junit-jupiter:5.8.2")
    testImplementation ("org.amshove.kluent:kluent:1.68")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}