package com.github.orezzero.plugindemo.services

import com.intellij.openapi.project.Project
import com.github.orezzero.plugindemo.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
