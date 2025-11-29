package com.portafolio.mi_portafolio_backend.service;


import com.portafolio.mi_portafolio_backend.model.Experience;
import com.portafolio.mi_portafolio_backend.repository.IExperienceRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExperienceServicesImpl implements IExperienceService{

    private final IExperienceRepository experienceRepository;

    public ExperienceServicesImpl(IExperienceRepository experienceRepository) {
        this.experienceRepository = experienceRepository;
    }

    @Override
    public List<Experience> findAll() {
        return experienceRepository.findAll();
    }

    @Override
    public Optional<Experience> findById(Long id) {
        return experienceRepository.findById(id);
    }

    @Override
    public Experience save(Experience experience) {
        // Validación 1: Asegurar que la fecha de inico no sea nula
        if(experience.getStartDate() == null){
            throw new IllegalArgumentException("La fecha de inico de la experiencia no puede estar vacia");
        }

        //Validación 2: La fecha de inicio no puede ser posterior a la de fin (solo si end_date no es nula)
        if(experience.getEndDate() != null
                && experience.getStartDate().isAfter(experience.getEndDate())
        ){
            throw new IllegalArgumentException("La fecha de inicio de la experiencia no puede ser posterior a la fecha de fin.");
        }

        // Validaciones 3 y 4 (ya estaban bien):
        if(experience.getJobTitle()==null || experience.getJobTitle().trim().isEmpty()){
            throw new IllegalArgumentException("El titulo del trabajo no puede estar vacío.");
        }
        if(experience.getCompanyName()==null || experience.getCompanyName().trim().isEmpty()){
            throw new IllegalArgumentException("El nombre de la compañia no puede estar vacío.");
        }
        return experienceRepository.save(experience);
    }

    @Override
    public void deleteById(Long id) {
        System.out.println("Eliminando experiencia por ID: " + id + " en el servicio...");
        experienceRepository.deleteById(id);
    }

    @Override
    public List<Experience> findExperienceByPersonalInfoId(Long personalInfoId) {
        return experienceRepository.findByPersonalInfoId(personalInfoId);
    }
}
