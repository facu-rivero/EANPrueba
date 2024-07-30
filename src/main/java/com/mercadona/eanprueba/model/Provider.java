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
@Table(name = "Provider")
public class Provider {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (name = "CODIGO_PROVEEDOR", nullable = false)
    private Integer providerCode;
    @Column (name = "NOMBRE_PROVEEDOR",nullable = false)
    private String providerName;
    @Column (name = "FECHA_CREACION",nullable = false)
    private LocalDate creationDate;


}
