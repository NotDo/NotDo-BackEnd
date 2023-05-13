plugins {
    kotlin("plugin.allopen") version PluginVersion.ALL_OPEN__PLUGIN_VERSION
}

dependencies {
    implementation(project(":notdo-domain"))
    implementation(project(":notdo-infrastructure"))
    implementation(Dependencies.Transaction.SPRING_TRANSACTION)
}

repositories {
    mavenCentral()
}

allOpen {
    annotation(AllOpen.SERVICE)
}