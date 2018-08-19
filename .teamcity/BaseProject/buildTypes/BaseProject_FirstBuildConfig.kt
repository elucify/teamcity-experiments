package BaseProject.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.script

object BaseProject_FirstBuildConfig : BuildType({
    uuid = "f5510e50-5bf9-467c-9179-0df09bd7e557"
    id = "BaseProject_FirstBuildConfig"
    name = "First build config"
    description = "This is the first build config"

    artifactRules = "date.txt => ."

    steps {
        script {
            name = "Step 1"
            scriptContent = """
                echo Build config 1 step 1
                date > date.txt
            """.trimIndent()
        }
        script {
            name = "Step 2"
            scriptContent = "echo Build config 1 step 2"
        }
    }
})
