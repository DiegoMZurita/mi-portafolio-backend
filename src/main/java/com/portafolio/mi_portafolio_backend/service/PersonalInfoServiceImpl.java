package com.portafolio.mi_portafolio_backend.service;

import com.portafolio.mi_portafolio_backend.exception.ValidationException;
import com.portafolio.mi_portafolio_backend.model.PersonalInfo;
import com.portafolio.mi_portafolio_backend.repository.IPersonalInfoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.BindingResult;

import org.springframework.validation.Validator;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PersonalInfoServiceImpl implements IPersonalInfoService {

    private final IPersonalInfoRepository personalInfoRepository;
    private final Validator validator;

//    Como estamos utilizando lombok no es necesario crear el constructor
//    public PersonalInfoServiceImpl(IPersonalInfoRepository personalInfoRepository,  Validator validator) {
//        this.personalInfoRepository = personalInfoRepository;
//        this.validator = validator;
//    }

    @Override
    public PersonalInfo save(PersonalInfo personalInfo) {
        BindingResult result = new BeanPropertyBindingResult(personalInfo, "personalInfo");
        validator.validate(personalInfo, result);
        if(result.hasErrors()){
            throw new ValidationException(result);
        }
        return personalInfoRepository.save(personalInfo);
    }

    @Override
    public Optional<PersonalInfo> findById(Long id) {
        return personalInfoRepository.findById(id);
    }

    @Override
    public List<PersonalInfo> findAll() {
        return personalInfoRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        personalInfoRepository.deleteById(id);
    }
}
