package com.portafolio.mi_portafolio_backend.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EducationDto {
    private Long id;

    @NotBlank(message = "El nombre del título no puede estar vacío")
    private String degree; // Ingeniería en Informatica

    @NotBlank(message = "El nombre de la institución no puede estar vacío")
    private String institution; // IPLACEX

    @NotNull(message = "La fecha de inicio no puede ser nula")
    @PastOrPresent(message = "La fecha de inicio no puede ser futura")
    private LocalDate startDate;

    @PastOrPresent(message = "La fecha de fin no puede ser futura")
    private LocalDate endDate; //Puede ser null si esta en curso

    @NotBlank(message = "La descripción no puede estar vacía")
    private String description; //Breve descripción de logros o cursos

    //La validación de la clave se maneja a nivel de servicio
    @NotNull(message = "El ID de información personal es obligatorio.")
    private Long personalInfoId; //Clave foranea a PersonalInfo
}
