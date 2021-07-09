package com.github.gtouchet.apistatistics.services

import com.github.gtouchet.apistatistics.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
