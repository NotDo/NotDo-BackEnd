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
}

dependencies {
    implementation(Dependencies.Kotlin.KOTLIN_JDK)
    implementation(Dependencies.Kotlin.KOTLIN_REFLECT)

    implementation(Dependencies.Test.SPRING_TEST)
    implementation(Dependencies.Test.MOCKK)

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
        dependencies {
            testImplementation("org.springframework.boot:spring-boot-starter-test:2.6.3")
            testImplementation("io.kotest:kotest-runner-junit5:5.5.5")
            testImplementation("io.kotest.extensions:kotest-extensions-spring:1.1.2")
            testImplementation("io.kotest:kotest-assertions-core:5.5.5")
            testImplementation("io.mockk:mockk:1.13.4")
        }
    }
    repositories {
        mavenCentral()
    }
}
