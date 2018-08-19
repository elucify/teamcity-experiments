package BaseProject.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.script

object BaseProject_SecondBuildConfig : BuildType({
    uuid = "8dacc8f3-e2ba-4713-bff5-414f5c4a93b7"
    id = "BaseProject_SecondBuildConfig"
    name = "Second build config"
    description = "This is the second build config"

    steps {
        script {
            name = "Step B - 1"
            scriptContent = "echo Build config 2 step 1; date "
        }
    }

    dependencies {
        dependency(BaseProject.buildTypes.BaseProject_FirstBuildConfig) {
            snapshot {
                onDependencyFailure = FailureAction.CANCEL
            }

            artifacts {
                artifactRules = "+:*"
            }
        }
    }
})
