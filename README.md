# Practicando-Spring-Framework-Challenge-Foro-Hub
# Foro Hub API

Proyecto del Challenge Back-End de Alura.

API REST desarrollada con Java y Spring Boot para gestionar tópicos de un foro con autenticación JWT.

## Tecnologías

Java 17  
Spring Boot  
Spring Security  
JWT  
H2 Database  

## Endpoints

POST /auth  
Genera token de autenticación.

GET /topicos  
Lista todos los tópicos.

POST /topicos  
Crea un tópico.

DELETE /topicos/{id}  
Elimina un tópico.

## Ejecutar

mvn spring-boot:run
