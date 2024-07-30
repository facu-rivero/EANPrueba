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
@Table (name = "Destination")
public class Destination {
    @Id
    private Long id;
    @Column (name = "CODIGO_DESTINO",nullable = false)
    private String DestinationCode;
    @Column (name = "NOMBRE_DESTINO", nullable = false)
    private String DestinantionName;
    @Column (name = "FECHA_CREACION", nullable = false)
    private LocalDate creationDate;
}
