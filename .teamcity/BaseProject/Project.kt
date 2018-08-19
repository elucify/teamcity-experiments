package BaseProject

import BaseProject.buildTypes.*
import BaseProject.vcsRoots.*
import BaseProject.vcsRoots.BaseProject_GithubTeamcityExperiments
import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.Project
import jetbrains.buildServer.configs.kotlin.v2017_2.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v2017_2.projectFeatures.versionedSettings

object Project : Project({
    uuid = "1bf64add-0a2b-4077-ab16-d790e4daf97b"
    id = "BaseProject"
    parentId = "_Root"
    name = "Base Project"
    description = "The base project where new teamcity projects are created"

    vcsRoot(BaseProject_GithubTeamcityExperiments)

    buildType(BaseProject_SecondBuildConfig)
    buildType(BaseProject_FirstBuildConfig)

    features {
        versionedSettings {
            id = "PROJECT_EXT_2"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.PREFER_SETTINGS_FROM_VCS
            rootExtId = BaseProject_GithubTeamcityExperiments.id
            showChanges = true
            settingsFormat = VersionedSettings.Format.KOTLIN
            storeSecureParamsOutsideOfVcs = true
        }
    }
})
