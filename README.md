# 🧑‍💻 Mi Portafolio Backend

Aplicación web desarrollada con **Spring Boot** orientada a la creación y administración de un portafolio profesional. El sistema permite mostrar información personal, proyectos, estudios, experiencia y habilidades, además de gestionar estos contenidos mediante operaciones CRUD de forma segura y estructurada.

El proyecto está diseñado con una arquitectura clara, separación de responsabilidades y buenas prácticas de desarrollo backend.

## 🌐 Aplicación en producción

Link: [https://mi-portafolio-backend-1yrb.onrender.com/](https://mi-portafolio-backend-1yrb.onrender.com/)

---

## 🚀 Funcionalidades principales

- Visualización de portafolio profesional mediante interfaz web.
- Administración de información personal.
- CRUD completo para:
  - Proyectos
  - Educación
  - Experiencia
  - Habilidades / conocimientos
  - Información personal
- Sistema de autenticación y autorización.
- Renderizado dinámico con Thymeleaf.
- Persistencia de datos en PostgreSQL usando Neon.
- Manejo centralizado de errores.
- Validación de datos en backend.
- Preparación para despliegue en Render mediante Docker.

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
- Neon PostgreSQL Serverless

### Despliegue

- Render
- Docker
- Variables de entorno para configuración segura

### Herramientas

- Maven
- Lombok
- Spring Boot DevTools
- JUnit
- Git / GitHub

---

## 🧱 Estructura del proyecto

### 📂 `src/main/java`

```text
config/        → Configuración de seguridad y componentes globales
controller/    → Controladores MVC
dto/           → Objetos de transferencia de datos
exception/     → Manejo de excepciones personalizadas
mapper/        → Conversión entre entidades y DTOs
model/         → Entidades del dominio
repository/    → Acceso a datos con Spring Data JDBC
rest/          → Controladores REST
service/       → Lógica de negocio
utils/         → Clases utilitarias y helpers
```

### 📂 `src/main/resources`

```text
static/
 css/      → Hojas de estilo de la aplicación
 img/      → Recursos gráficos e imágenes
 js/       → Scripts del frontend

templates/
 auth/             → Vistas relacionadas con autenticación
 education/        → Vistas de educación y formación académica
 experience/       → Vistas de experiencia profesional
 personalinfo/     → Vistas de información personal
 projects/         → Vistas de proyectos
 skills/           → Vistas de habilidades y conocimientos
 sections/         → Secciones reutilizables del portafolio
 fragments/        → Fragmentos Thymeleaf reutilizables
 error/            → Páginas de error personalizadas
```

---

## ⚙️ Configuración

El proyecto utiliza variables de entorno para evitar exponer credenciales sensibles.

Variables principales:

```text
DATABASE_URL
DATABASE_USERNAME
DATABASE_PASSWORD
SPRING_PROFILES_ACTIVE
SPRING_SQL_INIT_MODE
FILE_UPLOAD_DIR
STATIC_FILES_DIR
```

Para desarrollo local se puede usar como referencia el archivo:

```text
.env.example
```

---

## 🚀 Despliegue

El proyecto está preparado para desplegarse en **Render** usando:

```text
Dockerfile
render.yaml
```

En producción se recomienda mantener:

```text
SPRING_PROFILES_ACTIVE=prod
SPRING_SQL_INIT_MODE=never
```

Esto evita que los scripts SQL reinicialicen la base de datos en cada despliegue.
