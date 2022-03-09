package com.github.pavelka.ideaplugin.services

import com.intellij.openapi.project.Project
import com.github.pavelka.ideaplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
