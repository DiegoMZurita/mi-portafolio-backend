package com.portafolio.mi_portafolio_backend.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SkillDto {
    private Long id;

    @NotBlank(message = "El nombre de la habilidad no puede estar vacío")
    private String name; //Java, HTML, CSS

    @NotNull(message = "el porcentaj no puede ser nulo")
    @Min(value = 0, message = "El porcentaje debe ser igual o mayor a 0")
    @Max(value = 100, message = "El porcentaje debe ser igual o menos a 100")
    private Integer levelPercentage; // 90, 85, etc

    @NotBlank(message = "La clase del incono no puede estar vacía")
    private String iconClass; // Ejemplo: fab fa-java para FontAwesome

    @NotNull(message = "El Id de información personal es obligatorio.")
    private Long personalInfoId; // Clave foranea a PersonalInfo
}
