package com.github.hbuangin.huangbin.services

import com.github.hbuangin.huangbin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
