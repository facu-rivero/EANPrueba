package com.mercadona.eanprueba.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table (name = "Product")
public class Product {
    @Id
    private Long id;
    @Column(name = "CODIGO_PRODUCTO", nullable = false)
    private String productCode;
    @Column (name = "NOMBRE_PRODUCTO",nullable = false)
    private String productName;
    @Column (name = "FECHA_CREACION", nullable = false)
    private LocalDate creationDate;
}
