# Bibliotecas Backend

Backend desarrollado con Java y Spring Boot para la evaluación práctica **Sistema de bibliotecas y libros**.

El sistema permite registrar bibliotecas y consultar las bibliotecas existentes junto con los libros asociados a cada una.

## Tecnologías

- Java 25
- Spring Boot 4.2.0
- Spring Web MVC
- Spring Data JPA
- H2 Database
- Lombok
- Maven

## Modelo de datos

El sistema maneja dos entidades principales:

### Biblioteca

- id
- nombre
- direccion
- ciudad

Una biblioteca puede tener varios libros.

### Libro

- id
- titulo
- autor
- anioPublicacion
- biblioteca

Cada libro pertenece a una única biblioteca.

La relación entre las entidades es:

```text
Biblioteca 1 ---- N Libro
```

## Arquitectura

El proyecto está organizado por capas:

```text
src/main/java/desarrollo/web/bibliotecas
├── controller
│   └── BibliotecaController.java
├── entities
│   ├── Biblioteca.java
│   └── Libro.java
├── repository
│   ├── BibliotecaRepository.java
│   └── LibroRepository.java
├── service
│   └── BibliotecaService.java
├── BibliotecasBackendApplication.java
└── DataInitializer.java
```

## Endpoints

### Registrar biblioteca

```text
POST /bibliotecas
```

Ejemplo de cuerpo:

```json
{
  "nombre": "Biblioteca Sur",
  "direccion": "Calle 45 # 20-10",
  "ciudad": "Bogotá"
}
```

### Consultar bibliotecas

```text
GET /bibliotecas
```

La respuesta incluye las bibliotecas con sus libros asociados.

## Datos de prueba

Al iniciar la aplicación se cargan datos de prueba utilizando `CommandLineRunner`.

Bibliotecas:

- Biblioteca Central
- Biblioteca Norte

Libros:

- Cien años de soledad — Gabriel García Márquez — 1967
- El coronel no tiene quien le escriba — Gabriel García Márquez — 1961

Los libros quedan asociados a sus respectivas bibliotecas.

## Base de datos

El proyecto utiliza una base de datos H2 en memoria.

Configuración principal:

```text
jdbc:h2:mem:bibliotecasdb
```

La base de datos se crea nuevamente cada vez que se inicia la aplicación.

## Ejecución

### 1. Compilar el proyecto

Desde la raíz del proyecto ejecutar:

```bash
.\mvnw clean compile
```

### 2. Ejecutar la aplicación

Desde IntelliJ se puede ejecutar:

```text
BibliotecasBackendApplication
```

También puede ejecutarse desde terminal con:

```bash
.\mvnw spring-boot:run
```

### 3. Acceder a la API

El backend se ejecuta en:

```text
http://localhost:8080
```

Endpoint de consulta:

```text
http://localhost:8080/bibliotecas
```

## Frontend

El frontend se encuentra en un repositorio independiente:

```text
https://github.com/4stagon/bibliotecas-frontend
```