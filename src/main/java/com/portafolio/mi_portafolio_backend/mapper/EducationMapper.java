package com.portafolio.mi_portafolio_backend.mapper;

import com.portafolio.mi_portafolio_backend.dto.EducationDto;
import com.portafolio.mi_portafolio_backend.model.Education;

public class EducationMapper {

    public static EducationDto toDto(Education education) {
        if(education == null){
            return null;
        }
        EducationDto educationDto = new EducationDto();

        educationDto.setId(education.getId());
        educationDto.setDegree(education.getDegree());
        educationDto.setInstitution(education.getInstitution());
        educationDto.setStartDate(education.getStartDate());
        educationDto.setEndDate(education.getEndDate());
        educationDto.setDescription(education.getDescription());
        educationDto.setPersonalInfoId(education.getPersonalInfoId());

        return educationDto;
    }

    public static Education toEntity(EducationDto dto) {
        if (dto == null){
            return null;
        }

        Education education = new Education();

        education.setId(dto.getId());
        education.setDegree(dto.getDegree());
        education.setInstitution(dto.getInstitution());
        education.setStartDate(dto.getStartDate());
        education.setEndDate(dto.getEndDate());
        education.setDescription(dto.getDescription());
        education.setPersonalInfoId(dto.getPersonalInfoId());

        return education;
    }
}
