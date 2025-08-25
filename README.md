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

```json
[
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
]
