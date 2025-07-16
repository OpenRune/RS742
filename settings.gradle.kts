rootProject.name = "R472"

dependencyResolutionManagement {
    @Suppress("UnstableApiUsage")
    repositories {
        mavenCentral()
        maven("https://repo.runelite.net")
    }
}

pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://raw.githubusercontent.com/OpenRune/hosting/master")
    }
}

include("client","runelite")