pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "ShoppingApp"
include(":app")
include(":core-network")
include(":core-common")
include(":core-data")
include(":core-designsystem")
include(":core-localstorage")
include(":core-model")
include(":core-theme")
include(":core-navigation")
