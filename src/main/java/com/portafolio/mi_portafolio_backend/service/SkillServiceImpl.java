package com.portafolio.mi_portafolio_backend.service;

import com.portafolio.mi_portafolio_backend.exception.ValidationException;
import com.portafolio.mi_portafolio_backend.model.Skill;
import com.portafolio.mi_portafolio_backend.repository.ISkillRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SkillServiceImpl implements ISkillService {

    private final ISkillRepository skillRepository;
    private final Validator validator;

    @Override
    @Transactional(readOnly = true)
    public List<Skill> findAll() {
        return skillRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Skill> findById(Long id) {
        return skillRepository.findById(id);
    }

    @Override
    @Transactional
    public Skill save(Skill skill) {
        BindingResult result = new BeanPropertyBindingResult(skill, "skill");
        validator.validate(skill, result);
        if(result.hasErrors()){
            throw new ValidationException(result);
        }
//        if(skill.getLevelPercentage() < 0 || skill.getLevelPercentage() > 100){
//            throw new IllegalArgumentException("El porcentaje es incorrecto debe estar entre 0 y 100");
//        }
        return skillRepository.save(skill);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        skillRepository.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Skill> findSkillByPersonalInfoId(Long personalInfoId) {
        return skillRepository.findByPersonalInfoId(personalInfoId);
    }
}
