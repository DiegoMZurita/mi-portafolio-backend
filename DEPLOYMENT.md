# Despliegue en Render

Este proyecto es una aplicación Spring Boot con Thymeleaf, seguridad y PostgreSQL. Para este caso, Render encaja mejor que Vercel porque permite ejecutar el servidor Java como un servicio web persistente usando Docker.

## Archivos preparados

- `Dockerfile`: compila el proyecto con Maven y ejecuta el JAR con Java 21.
- `render.yaml`: blueprint para crear el servicio web en Render.
- `src/main/resources/application-prod.properties`: configuración segura para producción.
- `.env.example`: referencia de variables para local o Render.

## Variables requeridas en Render

Configura estas variables en el dashboard de Render o desde el blueprint:

```text
SPRING_PROFILES_ACTIVE=prod
SPRING_SQL_INIT_MODE=never
DATABASE_URL=jdbc:postgresql://HOST/DB_NAME?sslmode=require
DATABASE_USERNAME=usuario
DATABASE_PASSWORD=contraseña
FILE_UPLOAD_DIR=/tmp/portfolio-static/img/projects/
STATIC_FILES_DIR=/tmp/portfolio-static/
JAVA_OPTS=-XX:MaxRAMPercentage=75.0
```

`SPRING_SQL_INIT_MODE=never` evita que `schema.sql` borre tablas en producción. Si necesitas inicializar una base nueva, ejecuta los SQL manualmente una sola vez y luego conserva este valor en `never`.

## Pasos recomendados

1. Sube el repositorio a GitHub.
2. En Render, crea un nuevo Blueprint o Web Service desde el repositorio.
3. Render detectará `render.yaml` y usará Docker.
4. Completa las variables marcadas como secretas: `DATABASE_URL`, `DATABASE_USERNAME` y `DATABASE_PASSWORD`.
5. Haz deploy.

## Ejecutar localmente en IntelliJ

Para desarrollo local, configura las variables de `.env.example` como variables de entorno en IntelliJ, o crea un archivo ignorado por Git en:

```text
src/main/resources/application-local.properties
```

Puedes usar `src/main/resources/application-local.example.properties` como plantilla y completar tus credenciales reales ahí.

## Nota sobre imágenes subidas desde admin

En el plan gratuito de Render, el filesystem es efímero. Las imágenes que subas desde el admin pueden perderse después de un redeploy o restart. Para algo definitivo, conviene mover esas imágenes a Cloudinary, S3 o mantenerlas como archivos estáticos del repositorio.
