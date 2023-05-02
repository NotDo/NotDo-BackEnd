plugins {
    kotlin("plugin.allopen") version PluginVersion.ALL_OPEN__PLUGIN_VERSION

}
dependencies {
    implementation(project(":notdo-domain"))
    implementation(Dependencies.Transaction.SPRING_TRANSACTION)
}
allOpen {
    annotation(AllOpen.USECASE)
}