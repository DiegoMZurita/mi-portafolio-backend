 🧑‍💻 Mi Portafolio Backend

Aplicación web desarrollada con **Spring Boot** orientada a la creación y administración de portafolios profesionales de desarrolladores. El sistema permite mostrar información personal, proyectos, estudios, experiencia y habilidades, además de gestionar estos contenidos mediante operaciones CRUD de forma segura y estructurada.

El proyecto está diseñado con una arquitectura clara, separación de responsabilidades y buenas prácticas de desarrollo backend.

---

## 🚀 Funcionalidades principales

- Visualización de portafolio profesional mediante interfaz web.
- Soporte para múltiples perfiles.
- CRUD completo para:
  - Proyectos
  - Educación
  - Experiencia
  - Habilidades / conocimientos
  - Información personal
- Sistema de autenticación y autorización.
- Renderizado dinámico con Thymeleaf.
- Persistencia de datos en PostgreSQL (Neon).
- Manejo centralizado de errores.
- Validación de datos en backend.

---

## 🛠️ Tecnologías utilizadas

### Backend
- Java 21
- Spring Boot 4
- Spring MVC
- Spring Data JDBC
- Spring Security
- Spring Validation

### Frontend
- Thymeleaf
- HTML5
- CSS3
- Thymeleaf Extras Spring Security

### Base de datos
- PostgreSQL
- Neon (PostgreSQL serverless)

### Herramientas
- Maven
- Lombok
- Spring Boot DevTools
- JUnit

---

## 🧱 Estructura del proyecto

### 📂 src/main/java

```text
config/        → Configuración de seguridad y componentes globales
controller/    → Controladores MVC
dto/           → Objetos de transferencia de datos
exception/     → Manejo de excepciones personalizadas
mapper/        → Conversión entre entidades y DTOs
model/         → Entidades del dominio
repository/    → Acceso a datos con Spring Data JDBC
rest/          → Controladores REST (si aplica)
service/       → Lógica de negocio
utils/         → Clases utilitarias y helpers
```
### 📂 src/main/java
```text
static/
 css/      → Hojas de estilo de la aplicación
 img/      → Recursos gráficos e imágenes

templates/
 auth/             → Vistas relacionadas con autenticación y autorización
 education/        → Vistas de educación y formación académica
 experience/       → Vistas de experiencia profesional
 personalInfo/     → Vistas de información personal
 projects/         → Vistas de proyectos
 skills/           → Vistas de habilidades y conocimientos
 sections/         → Secciones reutilizables de la aplicación
 fragments/        → Fragmentos Thymeleaf reutilizables
 error/            → Páginas de error personalizadas
```

