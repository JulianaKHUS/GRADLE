pluginManagement {
    plugins {
        kotlin("jvm") version "1.9.0"
    }
}
plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}
rootProject.name = "untitled1"
include("db")
include("api")
include("service")

