plugins {
    id("org.springframework.boot") version PluginVersion.SPRING_VERSION
    id("io.spring.dependency-management") version PluginVersion.DEPENDENCY_MANAGER_VERSION
    kotlin("plugin.jpa") version PluginVersion.JPA_PLUGIN_VERSION
    kotlin("plugin.spring") version PluginVersion.SPRING_PLUGIN_VERSION
    kotlin("plugin.allopen") version PluginVersion.ALL_OPEN__PLUGIN_VERSION

}

dependencies {
    implementation(project(":notdo-application"))
    implementation(project(":notdo-domain"))

    implementation(Dependencies.Web.SPRING_WEB)
    implementation(Dependencies.Database.SPRING_DATA_JPA)
    implementation(Dependencies.Database.SPRING_REDIS)
    runtimeOnly(Dependencies.Database.MYSQL_CONNECTOR)
}

tasks.getByName<Jar>("bootJar") {
    enabled = false
}