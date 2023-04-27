object Dependencies {
    object Kotlin {
        const val KOTLIN_REFLECT = "org.jetbrains.kotlin:kotlin-reflect"
        const val KOTLIN_JDK = "org.jetbrains.kotlin:kotlin-stdlib-jdk8"
    }

    object Transaction {
        const val SPRING_TRANSACTION = "org.springframework:spring-tx:${Versions.SPRING_TRANSACTION}"
    }

    object Web {
        const val SPRING_WEB = "org.springframework.boot:spring-boot-starter-web"
    }

    object Validation {
        const val SPRING_VALIDATION = "org.springframework.boot:spring-boot-starter-validation"
    }

    object Configuration {
        const val CONFIGURATION_PROCESSOR = "org.springframework.boot:spring-boot-configuration-processor"
    }

    object Security {
        const val SPRING_SECURITY = "org.springframework.boot:spring-boot-starter-security"
    }

    object Jwt {
        const val JWT = "io.jsonwebtoken:jjwt:${Versions.JWT_VERSION}"
    }

    object Database {
        const val SPRING_DATA_JPA = "org.springframework.boot:spring-boot-starter-data-jpa"
        const val MYSQL_CONNECTOR = "com.mysql:mysql-connector-j"
        const val SPRING_REDIS = "org.springframework.boot:spring-boot-starter-data-redis"
    }

    object Querydsl {
        const val QUERYDSL = "com.querydsl:querydsl-jpa:${Versions.QUERYDSL}"
        const val QUERYDSL_PROCESSOR = "com.querydsl:querydsl-apt:${Versions.QUERYDSL}:jpa"
    }

    object Test {
        const val SPRING_TEST = "org.springframework.boot:spring-boot-starter-test:${Versions.SPRING_TEST}"
        const val MOCKK = "io.mockk:mockk:${Versions.MOCKK}"
        const val KOTEST_RUNNER = "io.kotest:kotest-runner-junit5:${Versions.KOTEST_JUNIT}"
        const val KOTEST_EXTENSION = "io.kotest.extensions:kotest-extensions-spring:${Versions.KOTEST_EXTENSION}"
        const val KOTEST_ASSERTIONS = "io.kotest:kotest-assertions-core:${Versions.KOTEST_ASSERTIONS}"
    }

}