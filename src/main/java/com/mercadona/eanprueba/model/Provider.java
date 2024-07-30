package com.mercadona.eanprueba.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
    private Long id;
    @Column (name = "CODIGO_PROVEEDOR", nullable = false)
    private String providerCode;
    @Column (name = "NOMBRE_PROVEEDOR",nullable = false)
    private String providerName;
    @Column (name = "FECHA_CREACION",nullable = false)
    private LocalDate creationDate;


}
