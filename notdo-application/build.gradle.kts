plugins {
    kotlin("plugin.allopen") version "1.6.21"
}
dependencies {
    implementation(project(":notdo-domain"))
    implementation(Dependencies.Transaction.SPRING_TRANSACTION)
}