package com.portafolio.mi_portafolio_backend.service;


import com.portafolio.mi_portafolio_backend.model.Education;
import com.portafolio.mi_portafolio_backend.repository.IEducationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.Validator;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EducationServicesImpl implements IEducationService{

    private final IEducationRepository educationRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Education> findAll() {
        return this.educationRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Education> findById(Long id) {
        return this.educationRepository.findById(id);
    }

    @Override
    @Transactional
    public Education save(Education education) {
        return educationRepository.save(education);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        System.out.println("Eliminando educación por ID: " + id + " en el servicio...");
        educationRepository.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Education> findEducationByPersonalInfoId(Long personalInfoId) {
        return educationRepository.findByPersonalInfoId(personalInfoId);
    }
}
