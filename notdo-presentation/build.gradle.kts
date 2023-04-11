plugins {
    id("org.springframework.boot") version "2.7.5"
    id("io.spring.dependency-management") version "1.1.0"
    kotlin("plugin.spring") version "1.7.22"
}

dependencies {
    implementation(project(":notdo-domain"))

    implementation(Dependencies.Web.SPRING_WEB)
}

tasks.getByName<Jar>("bootJar") {
    enabled = false
}