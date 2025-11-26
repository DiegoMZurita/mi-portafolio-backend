package com.portafolio.mi_portafolio_backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Project {
    private Long id;
    private String title;
    private String description;
    private String imageUrl; //URL o ruta a la imagen del proyecto
    private String projectUrl; //URL al proyecto desplegado (si existe) o Github
    private Long personalInfoId; // Clave foranea a PersonalInfo
}
