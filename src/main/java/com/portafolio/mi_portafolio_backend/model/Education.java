package com.portafolio.mi_portafolio_backend.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Education {
    private Long id;

    private String degree; // Ingeniería en Informatica

    private String institution; // IPLACEX

    private LocalDate startDate;

    private LocalDate endDate; //Puede ser null si esta en curso

    private String description; //Breve descripción de logros o cursos

    //La validación de la clave se maneja a nivel de servicio
    private Long personalInfoId; //Clave foranea a PersonalInfo
}
