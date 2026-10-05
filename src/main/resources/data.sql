INSERT INTO personal_info (first_name, last_name, title, profile_description, profile_image_url, years_of_experience, email, phone, linkedin_url, github_url) VALUES
<<<<<<< HEAD
('Diego', 'Martínez', 'Full Stack Developer', 'Apasionado por el desarrollo web con experiencia en Java, Spring Boot y React. Disfruto construyendo soluciones robustas y escalables.', 'img/20250129_113005.jpg', 0, 'diego.marzurita@gmail.com', '+569455075968', 'https://www.linkedin.com/in/diego-mart%C3%ADnez-zurita-0b8200367/', 'https://github.com/DiegoMZurita');

INSERT INTO skills (name, level_percentage, icon_class, personal_info_id) VALUES
('Java', 90, 'img/logos/java.png', 1),
('Spring Boot', 85, 'img/logos/spring.png', 1),
('Python', 90, 'img/logos/python.png', 1),
('Django', 80, 'img/logos/django.png', 1),
('PostgreSQL', 80, 'img/logos/servidor-sql.png', 1),
('HTML', 95, 'img/logos/html-5.png', 1),
('CSS', 90, 'img/logos/css-3.png', 1),
('JavaScript', 75, 'img/logos/js.png', 1);


INSERT INTO educations (degree, institution, start_date, end_date, description, personal_info_id) VALUES
('Técnico en Desarrollo de Aplicaciones Multiplataforma', 'IPLACEX', '2022-03-01', '2025-12-15', 'Especialización en desarrollo de aplicaciones multiplataforma.', 1),
('Ingeniería en Informática', 'IPLACEX', '2022-03-01', NULL , 'Especialización en desarrollo de software y bases de datos, en ultimo año.', 1),
('Curso de Spring Boot Avanzado', 'UDEMY', '2025-10-10', NULL , 'Profundización en microservicios y seguridad, en proceso.', 1);

INSERT INTO experiences (job_title, company_name, start_date, end_date, description, personal_info_id) VALUES
('Desarrollador Full Stack Junior', 'SECTRA', '2025-02-05', '2025-04-05', 'Desarrollo, mantención y mejora de un sistema legado de gestión de estudios y órdenes de trabajo (SIGES)', 1);

INSERT INTO projects (title, description, image_url, project_url, personal_info_id) VALUES
('Portfolio Personal', 'Un portafolio web para mostrar mis habilidades y proyectos.', 'img/projects/project2.jpg', 'https://github.com/DiegoMZurita/mi-portafolio-backend', 1),
('Aplicación de E-commerce', 'Plataforma de comercio electrónico con carrito de compras y pasarela de pago.', 'img/projects/project1.jpg', 'https://github.com/DiegoMZurita/ecommerce-rincon-nutritivo', 1);

INSERT INTO users (username, password, enabled) VALUES ('admin', '$2a$10$IF4RX2uXh0fK7gB3qrmQmeUGPqaBgyawpMVu8BVqOFtcgdpSE/r.W', TRUE);
=======
('Diego', 'Martínez Zurita', 'Full Stack Developer', 'Ingeniero en Informática titulado y desarrollador full stack orientado a la creación de aplicaciones web, APIs REST y sistemas de negocio. Trabajo con Java, Spring Boot, React, TypeScript, Node.js, Express, Django y bases de datos relacionales, con experiencia en mantención de sistemas legacy, reportes, seguridad, testing, despliegues y fundamentos de AWS.', 'img/20250129_113005.jpg', 1, 'diego.marzurita@gmail.com', '+56 9 4550 7598', 'https://www.linkedin.com/in/diego-mart%C3%ADnez-zurita-0b8200367/', 'https://github.com/DiegoMZurita');

INSERT INTO skills (name, level_percentage, icon_class, personal_info_id) VALUES
('Spring Boot', 90, 'img/logos/spring.png', 1),
('React', 85, 'img/logos/react.webp', 1),
('TypeScript', 80, 'img/logos/ts.webp', 1),
('JavaScript', 85, 'img/logos/js.png', 1),
('HTML5', 90, 'img/logos/html-5.png', 1),
('CSS3', 90, 'img/logos/css-3.png', 1),
('Node.js', 80, 'img/logos/nodejs.png', 1),
('Express', 80, 'img/logos/express.webp', 1),
('Django', 80, 'img/logos/django.svg', 1),
('PostgreSQL', 85, 'img/logos/postgresql.png', 1),
('SQL Server', 80, 'img/logos/sqlserver.png', 1),
('MySQL', 75, 'img/logos/MySQL.webp', 1),
('MongoDB', 70, 'img/logos/mongodb.webp', 1),
('Git & GitHub', 85, 'img/logos/github.png', 1),
('Docker', 75, 'img/logos/docker.png', 1),
('Jenkins', 70, 'img/logos/Jenkins.png', 1),
('AWS', 70, 'img/logos/aws.webp', 1);

INSERT INTO educations (degree, institution, start_date, end_date, description, personal_info_id) VALUES
('Ingeniería en Informática', 'IPLACEX', '2022-03-01', '2026-12-15', 'Titulado. Formación en desarrollo de software, bases de datos, arquitectura de aplicaciones y soluciones informáticas.', 1),
('Técnico en Desarrollo de Aplicaciones Multiplataforma', 'IPLACEX', '2022-03-01', '2025-12-15', 'Titulado. Especialización en desarrollo de aplicaciones multiplataforma.', 1),
('AWS Cloud Quest: Cloud Practitioner', 'AWS', '2026-01-01', NULL, 'Certificación orientada a fundamentos de computación en la nube, EC2, VPC, IAM, RDS, DynamoDB, EFS, Auto Scaling, CloudWatch y Security Groups.', 1),
('Master Microservices with Spring Boot and Spring Cloud', 'Udemy', '2025-10-10', NULL, 'Formación en microservicios, Spring Boot, Spring Cloud y patrones de backend.', 1),
('Django: Crea aplicaciones web robustas con Python', 'Udemy', '2025-01-01', NULL, 'Formación en desarrollo web con Django, arquitectura MVT, autenticación y persistencia.', 1),
('Node.js: De cero a experto', 'DevTalles', '2025-01-01', NULL, 'Formación en backend con Node.js, Express, APIs REST, autenticación y servicios web.', 1),
('React: de cero a experto', 'DevTalles', '2025-01-01', NULL, 'Formación en React, hooks, estado, componentes y construcción de interfaces modernas.', 1);

INSERT INTO experiences (job_title, company_name, start_date, end_date, description, personal_info_id) VALUES
('Backend Developer', 'SECTRA - Ministerio de Transportes y Telecomunicaciones', '2025-01-01', '2026-03-31', 'Contribuí a la continuidad operativa de SIGES mediante mantención evolutiva y correctiva, desarrollo y refactorización de módulos con Java J2EE, Struts, JSP y JavaBeans. Optimicé consultas, estructuras e índices en SQL Server, mejorando procesos, reportes y tiempos de respuesta, además de apoyar módulos de reportabilidad, integración y modernización de código legacy.', 1),
('Desarrollador Full Stack Freelance', 'Proyectos freelance', '2026-01-01', NULL, 'Desarrollo de aplicaciones full stack con React, TypeScript, Spring Boot, Node.js, Express, PostgreSQL/Neon y Supabase, incluyendo inventario, ventas, reportes, autenticación JWT, control de roles, Cloudinary, pruebas automatizadas y despliegues en Vercel y Render.', 1);

INSERT INTO projects (title, description, image_url, project_url, personal_info_id) VALUES
('Portfolio Personal', 'Portafolio web desarrollado con Spring Boot, Thymeleaf, Spring Security, PostgreSQL/Neon y Maven para mostrar perfil, experiencia, educación, habilidades y proyectos.', 'img/projects/portafolio.png', 'https://github.com/DiegoMZurita/mi-portafolio-backend', 1),
('Sistema Full Stack de Inventario, Ventas y Reportes', 'Aplicación full stack para administrar productos, stock, ferias, ventas, promociones y reportes. Incluye API REST con Spring Boot, Spring Security, Spring Data JPA, Hibernate, Flyway, DTOs, validaciones, punto de venta, reportes Excel, Cloudinary y pruebas con JUnit, Mockito, MockMvc y H2.', 'img/projects/inventario.png', 'https://github.com/DiegoMZurita', 1),
('Sistema Web de Gestión para Masas y Empanadas Santa Emma', 'Aplicación web full stack con React, TypeScript, Node.js y Express para pedidos, reservas, productos, pagos, stock, alertas y reportes. Incluye JWT, roles, predicción de demanda, ExcelJS, Prisma ORM, Zod, PostgreSQL/Supabase, JMeter y despliegue en Vercel/Render.', 'img/projects/santaemma.png', 'https://github.com/DiegoMZurita', 1),
('Plataforma E-commerce', 'E-commerce full stack con Django, HTML5, CSS3, Bootstrap y JavaScript. Incluye catálogo, búsqueda, carrito, gestión de usuarios, CRUD, arquitectura MVT, PayPal, autenticación, hashing de contraseñas y HTTPS.', 'img/projects/rinconnutritivo.png', 'https://github.com/DiegoMZurita/ecommerce-rincon-nutritivo', 1);

INSERT INTO users (username, password, enabled) VALUES
('admin', '$2a$10$HEZZxyEspznlpk6KLnQ5feFQ8xKBwzOzxBAPk/NM1xvJx9CBKu8We', TRUE);
>>>>>>> 3b90af7 (Actualizacion portafolio y preparado para despliegue)
