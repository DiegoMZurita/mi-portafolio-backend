package com.portafolio.mi_portafolio_backend.service;

import com.portafolio.mi_portafolio_backend.model.Project;

import java.util.List;
<<<<<<< HEAD

public interface IProjectService {
    List<Project> findALL();
    Project save(Project project);
}

=======
import java.util.Optional;

public interface IProjectService {
    List<Project> findALL();
    Optional<Project> findById(Long id);
    Project save(Project project);
    void deleteById(Long id);
}
>>>>>>> 3b90af7 (Actualizacion portafolio y preparado para despliegue)
