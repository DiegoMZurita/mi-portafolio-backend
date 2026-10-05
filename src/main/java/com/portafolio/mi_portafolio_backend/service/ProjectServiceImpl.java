package com.portafolio.mi_portafolio_backend.service;

import com.portafolio.mi_portafolio_backend.model.Project;
import com.portafolio.mi_portafolio_backend.repository.IProjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
<<<<<<< HEAD
=======
import java.util.Optional;
>>>>>>> 3b90af7 (Actualizacion portafolio y preparado para despliegue)

@Service
@RequiredArgsConstructor
public class ProjectServiceImpl implements IProjectService{

    private final IProjectRepository projectRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Project> findALL() {
        return projectRepository.findAll();
    }

    @Override
<<<<<<< HEAD
=======
    @Transactional(readOnly = true)
    public Optional<Project> findById(Long id) {
        return projectRepository.findById(id);
    }

    @Override
>>>>>>> 3b90af7 (Actualizacion portafolio y preparado para despliegue)
    @Transactional
    public Project save(Project project) {
        return projectRepository.save(project);
    }
<<<<<<< HEAD
=======

    @Override
    @Transactional
    public void deleteById(Long id) {
        projectRepository.deleteById(id);
    }
>>>>>>> 3b90af7 (Actualizacion portafolio y preparado para despliegue)
}
