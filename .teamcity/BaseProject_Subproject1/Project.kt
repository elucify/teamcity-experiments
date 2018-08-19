package BaseProject_Subproject1

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.Project

object Project : Project({
    uuid = "5189d270-bbaa-49d8-98e4-da97cd5c2845"
    id = "BaseProject_Subproject1"
    parentId = "BaseProject"
    name = "Subproject 1"
    description = "First subproject of base project"
})
