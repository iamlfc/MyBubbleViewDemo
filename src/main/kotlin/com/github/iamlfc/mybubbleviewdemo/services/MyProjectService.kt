package com.github.iamlfc.mybubbleviewdemo.services

import com.intellij.openapi.project.Project
import com.github.iamlfc.mybubbleviewdemo.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
