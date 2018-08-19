package BaseProject.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.vcs.GitVcsRoot

object BaseProject_GithubTeamcityExperiments : GitVcsRoot({
    uuid = "2c325c1f-5659-4c7b-b5f9-c5845c8ac9a9"
    id = "BaseProject_GithubTeamcityExperiments"
    name = "github-teamcity-experiments"
    url = "git@github.com:elucify/teamcity-experiments.git"
    authMethod = uploadedKey {
        userName = "git"
        uploadedKey = "id_kid"
        passphrase = "credentialsJSON:f9c2180e-d0e2-47fa-9ed1-f0f1de86b4f7"
    }
})
