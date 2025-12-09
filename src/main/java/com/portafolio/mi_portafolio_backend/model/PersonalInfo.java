package com.portafolio.mi_portafolio_backend.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.URL;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonalInfo {
    private Long id; // Clave primaria

    private String firstName;

    private String lastName;

    private String title; // Ejemplo "Full Stack Developer"

    private String profileDescription; //Descripción de mi perfil

    private String profileImageUrl; //URL o ruta a la imagen de perfil

    private Integer yearsOfExperience;

    private String email;

    private String phone;

    private String linkedinUrl;

    private String githubUrl;
}
