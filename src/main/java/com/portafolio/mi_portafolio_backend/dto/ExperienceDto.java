package com.portafolio.mi_portafolio_backend.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExperienceDto {
    private Long id;

    @NotBlank(message = "El título del puesto no puede estar vacío")
    private String jobTitle; //Ej: "Full Stack Developer

    @NotBlank(message = "El nombre de la compañía no puede estar vacío")
    private String CompanyName;

    @NotNull(message = "La facha de inico no puede ser nula")
    @PastOrPresent(message = "La fecha de inicio no puede ser futura")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate startDate;

    @PastOrPresent(message = "La fecha de fin no puede ser futura")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate endDate; //Puede ser null si es el puesto actul

    @NotBlank(message = "La descripción no puede estar vacía")
    private String description; //Responsabilidades y logros

    //La validación de la clave foránea se maneja a nivel de servicio
    @NotNull(message = "El Id de información personal es obligatorio.")
    private Long personalInfoId; // Clave foranea a PersonalInfo
}
