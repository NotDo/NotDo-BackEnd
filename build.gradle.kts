plugins {
    kotlin("jvm") version PluginVersion.JVM_VERSION
}

repositories {
    mavenCentral()
}

subprojects {
    apply {
        plugin("org.jetbrains.kotlin.jvm")
        version = PluginVersion.JVM_VERSION
    }
    dependencies {
        implementation(Dependencies.Kotlin.KOTLIN_JDK)
        implementation(Dependencies.Kotlin.KOTLIN_REFLECT)
        implementation(Dependencies.Web.SPRING_WEB)
        testImplementation(Dependencies.Test.KOTEST_RUNNER)
        testImplementation(Dependencies.Test.SPRING_TEST)
        testImplementation(Dependencies.Test.MOCKK)
    }
}

allprojects {
    group = "com.gsm"
    version = "0.0.1-SNAPSHOT"
    java.sourceCompatibility = JavaVersion.VERSION_11

    tasks {
        compileKotlin {
            kotlinOptions {
                freeCompilerArgs = listOf("-Xjsr305=strict")
                jvmTarget = "11"
            }
        }
        compileJava {
            sourceCompatibility = JavaVersion.VERSION_11.majorVersion
        }
        test {
            useJUnitPlatform()
        }
    }

    repositories {
        mavenCentral()
    }
}