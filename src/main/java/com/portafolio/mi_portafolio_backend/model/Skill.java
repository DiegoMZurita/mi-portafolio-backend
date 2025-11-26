package com.portafolio.mi_portafolio_backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Skill {
    private Long id;
    private String name; //Java, HTML, CSS
    private Integer levelPercentage; // 90, 85, etc
    private String iconClass; // Ejemplo: fab fa-java para FontAwesome
    private Long personalInfoId; // Clave foranea a PersonalInfo
}
