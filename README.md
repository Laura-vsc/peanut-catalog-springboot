# Peanut Catalog - Spring Boot

Este proyecto es una API REST en **Spring Boot** para la gestión de un catálogo de productos de maní.  
Permite realizar operaciones CRUD (Crear, Leer, Actualizar y Eliminar) sobre los productos.  

---

##  Tecnologías utilizadas
- Java 21
- Spring Boot
- Spring Data JPA
- Maven
- H2 Database (por defecto)

---

## Endpoints disponibles

### 1️ Listar todos los productos
**GET** `/api/products`

 Body (JSON):

  {
    "id": 1,
    "name": "Maní salado",
    "category": "Tostado",
    "price": 5000,
    "weight": "250 g",
    "flavor": "Salado"
  },
  {
    "id": 2,
    "name": "Maní confitado",
    "category": "Empacado",
    "price": 6000,
    "weight": "500 g",
    "flavor": "Dulce"
  }

### 2 Guardar un producto

POST /api/products

 Body (JSON):

{
  "name": "Maní con chocolate",
  "category": "Empacado",
  "price": 7500,
  "weight": "300 g",
  "flavor": "Dulce"
}


 Respuesta:

{
  "id": 3,
  "name": "Maní con chocolate",
  "category": "Empacado",
  "price": 7500,
  "weight": "300 g",
  "flavor": "Dulce"
}

### 3️ Buscar producto por ID

GET /api/products/{id}

Ejemplo: /api/products/1

Respuesta:

{
  "id": 1,
  "name": "Maní salado",
  "category": "Tostado",
  "price": 5000,
  "weight": "250 g",
  "flavor": "Salado"
}

### 4️ Actualizar un producto

PUT /api/products/{id}

 Body (JSON):

{
  "name": "Maní premium",
  "category": "Natural",
  "price": 9000,
  "weight": "1 kg",
  "flavor": "Mixto"
}


 Respuesta:

{
  "id": 1,
  "name": "Maní premium",
  "category": "Natural",
  "price": 9000,
  "weight": "1 kg",
  "flavor": "Mixto"
}

### 5️ Eliminar un producto

DELETE /api/products/{id}

Ejemplo: /api/products/3

