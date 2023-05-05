plugins {
    id("org.springframework.boot") version PluginVersion.SPRING_VERSION
    id("io.spring.dependency-management") version PluginVersion.DEPENDENCY_MANAGER_VERSION
    kotlin("plugin.spring") version PluginVersion.SPRING_PLUGIN_VERSION
}


dependencies {
    implementation(project(":notdo-application"))
    implementation(project(":notdo-domain"))
    implementation(project(":notdo-presentation"))

    implementation(Dependencies.Database.SPRING_DATA_JPA)
    implementation(Dependencies.Validation.SPRING_VALIDATION)
    implementation(Dependencies.Web.SPRING_WEB)
    implementation(Dependencies.Database.SPRING_REDIS)
    implementation(Dependencies.Security.SPRING_SECURITY)
    implementation(Dependencies.Jwt.JWT)
    runtimeOnly(Dependencies.Database.MYSQL_CONNECTOR)
    annotationProcessor(Dependencies.Configuration.CONFIGURATION_PROCESSOR)
}

tasks.getByName<Jar>("bootJar") {
    enabled = false
}