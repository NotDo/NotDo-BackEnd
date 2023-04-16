plugins {
    id("org.springframework.boot") version PluginVersion.SPRING_VERSION
    id("io.spring.dependency-management") version PluginVersion.DEPENDENCY_MANAGER_VERSION
    kotlin("plugin.spring") version PluginVersion.SPRING_PLUGIN_VERSION
}

dependencies {
    implementation(project(":notdo-domain"))

    implementation(Dependencies.Web.SPRING_WEB)
}

tasks.getByName<Jar>("bootJar") {
    enabled = false
}