INSERT INTO personal_info (first_name, last_name, title, profile_description, profile_image_url, years_of_experience, email, phone, linkedin_url, github_url) VALUES
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
