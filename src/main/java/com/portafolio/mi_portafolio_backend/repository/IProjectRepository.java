package com.portafolio.mi_portafolio_backend.repository;

import com.portafolio.mi_portafolio_backend.model.Project;

import java.util.List;
import java.util.Optional;

public interface IProjectRepository {
    List<Project> findAll();
    Optional<Project> findById(Long id);
    Project save(Project project);
    void deleteById(Long id);
}
