package com.portafolio.mi_portafolio_backend.service;

import com.portafolio.mi_portafolio_backend.model.Project;

import java.util.List;
import java.util.Optional;

public interface IProjectService {
    List<Project> findALL();
    Optional<Project> findById(Long id);
    Project save(Project project);
    void deleteById(Long id);
}
