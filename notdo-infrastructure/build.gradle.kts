plugins {
    id("org.springframework.boot") version "2.7.5"
    id("io.spring.dependency-management") version "1.1.0"
    kotlin("plugin.jpa") version "1.6.21"
    kotlin("plugin.spring") version "1.7.22"
}


dependencies {
    implementation(project(":notdo-domain"))
    implementation(project(":notdo-presentation"))

    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-validation")
    implementation(Dependencies.Web.SPRING_WEB)
    runtimeOnly("com.mysql:mysql-connector-j")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.springframework.security:spring-security-test")
    testImplementation("io.kotest:kotest-runner-junit5:5.5.5")
    testImplementation("io.kotest.extensions:kotest-extensions-spring:1.1.2")
    testImplementation("io.kotest:kotest-assertions-core:5.5.5")
    testImplementation("io.mockk:mockk:1.13.4")
    annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")
}