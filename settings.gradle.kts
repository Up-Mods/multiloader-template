pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
        maven("https://maven.neoforged.net/releases") {
            name = "NeoForge"
        }
        maven("https://maven.fabricmc.net") {
            name = "Fabric"
        }
        maven("https://maven.uuid.gg/releases") {
            name = "Up-Mods"
        }
    }
}

plugins {
    // https://github.com/Up-Mods/multiloader-gradle-plugin
    id("dev.upcraft.gradle.multiloader.settings") version "0.4.3"
}

rootProject.name = "ExampleMod"

listOf("Common", "Fabric", "NeoForge").forEach {
    include(it)
    project(":$it").name = "${rootProject.name}-$it"
}
