package com.portafolio.mi_portafolio_backend.mapper;

import com.portafolio.mi_portafolio_backend.dto.PersonalInfoDto;
import com.portafolio.mi_portafolio_backend.model.PersonalInfo;

public class PersonalInfoMapper {

    public static PersonalInfoDto toDto(PersonalInfo personalInfo) {
        if(personalInfo == null) {
            return null;
        }
        PersonalInfoDto dto = new PersonalInfoDto();

        dto.setId(personalInfo.getId());
        dto.setFirstName(personalInfo.getFirstName());
        dto.setLastName(personalInfo.getLastName());
        dto.setTitle(personalInfo.getTitle());
        dto.setProfileDescription(personalInfo.getProfileDescription());
        dto.setProfileImageUrl(personalInfo.getProfileImageUrl());
        dto.setYearsOfExperience(personalInfo.getYearsOfExperience());
        dto.setEmail(personalInfo.getEmail());
        dto.setPhone(personalInfo.getPhone());
        dto.setLinkedinUrl(personalInfo.getLinkedinUrl());
        dto.setGithubUrl(personalInfo.getGithubUrl());
        return dto;
    }

    public static PersonalInfo toEntity(PersonalInfoDto personalInfoDto) {
        if(personalInfoDto == null) {
            return null;
        }
        PersonalInfo personalInfo = new PersonalInfo();

        personalInfo.setId(personalInfoDto.getId());
        personalInfo.setFirstName(personalInfoDto.getFirstName());
        personalInfo.setLastName(personalInfoDto.getLastName());
        personalInfo.setTitle(personalInfoDto.getTitle());
        personalInfo.setProfileDescription(personalInfoDto.getProfileDescription());
        personalInfo.setProfileImageUrl(personalInfoDto.getProfileImageUrl());
        personalInfo.setYearsOfExperience(personalInfoDto.getYearsOfExperience());
        personalInfo.setEmail(personalInfoDto.getEmail());
        personalInfo.setPhone(personalInfoDto.getPhone());
        personalInfo.setLinkedinUrl(personalInfoDto.getLinkedinUrl());
        personalInfo.setGithubUrl(personalInfoDto.getGithubUrl());
        return personalInfo;
    }
}
