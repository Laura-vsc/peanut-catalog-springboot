package com.districomestibles.peanut_catalog.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "products")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "El nombre no puede estar vacío")
    private String name;

    @NotBlank(message = "La categoría no puede estar vacía")
    private String category; // p.ej.: "Natural", "Tostado", "Empacado"

    @Min(value = 0, message = "El precio no puede ser negativo")
    private Double price;

    private String weight; // p.ej.: "250 g", "1 kg"
    private String flavor; // p.ej.: "Salado", "Dulce", "Mixto"
}
