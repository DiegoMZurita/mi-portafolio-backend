package com.portafolio.mi_portafolio_backend.service;

import com.portafolio.mi_portafolio_backend.model.Project;

import java.util.List;

public interface IProjectService {
    List<Project> findALL();
    Project save(Project project);
}

