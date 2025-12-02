package com.portafolio.mi_portafolio_backend.service;

import com.portafolio.mi_portafolio_backend.exception.ValidationException;
import com.portafolio.mi_portafolio_backend.model.Education;
import com.portafolio.mi_portafolio_backend.repository.IEducationRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;

import java.util.List;
import java.util.Optional;

@Service
public class EducationServicesImpl implements IEducationService{

    private final IEducationRepository educationRepository;
    private final Validator validator;

    public EducationServicesImpl(IEducationRepository educationRepository, Validator validator) {
        this.educationRepository = educationRepository;
        this.validator = validator;
    }

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
        BindingResult result = new BeanPropertyBindingResult(education, "education");
        validator.validate(education, result);
        if (result.hasErrors()) {
            throw new ValidationException(result);
        }
//        //Validación 1: Asegurar que la fecha de inicio no sea nula, como exige la DB
//        if(education.getStartDate() == null){
//            throw new IllegalArgumentException("La fecha de inicio de la educación no puede estar vacía.");
//        }
//
//        //Validación 2: la fecha de inicio no puede ser posterior a la de fin
//        if(education.getEndDate() != null && education.getStartDate().isAfter(education.getEndDate())){
//            throw new IllegalArgumentException("La fecha de inicio de la educación no puede ser posterior a la fecha de fin.");
//        }
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
