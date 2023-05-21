import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.springframework.boot") version PluginVersion.SPRING_VERSION
    id("io.spring.dependency-management") version PluginVersion.DEPENDENCY_MANAGER_VERSION
    kotlin("jvm") version PluginVersion.JVM_VERSION
    kotlin("plugin.spring") version PluginVersion.SPRING_PLUGIN_VERSION
    kotlin("plugin.jpa") version PluginVersion.JPA_PLUGIN_VERSION
}

group = "com.gsm"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(Dependencies.Web.SPRING_WEB)
    implementation(Dependencies.Database.SPRING_DATA_JPA)
    implementation(Dependencies.Database.SPRING_REDIS)
    implementation("org.springframework.boot:spring-boot-starter-mail:3.0.4")
    implementation(Dependencies.Validation.SPRING_VALIDATION)
    implementation(Dependencies.Kotlin.KOTLIN_REFLECT)
    implementation(Dependencies.Kotlin.KOTLIN_JDK)
    implementation(Dependencies.Security.SPRING_SECURITY)
    implementation(Dependencies.Jwt.JWT)
    runtimeOnly(Dependencies.Database.MYSQL_CONNECTOR)
    testImplementation(Dependencies.Test.SPRING_TEST)
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "11"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}