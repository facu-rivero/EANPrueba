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
@Table (name = "Destination")
public class Destination {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (name = "CODIGO_DESTINO",nullable = false)
    private Integer destinationCode;
    @Column (name = "NOMBRE_DESTINO", nullable = false)
    private String destinantionName;
    @Column (name = "FECHA_CREACION", nullable = false)
    private LocalDate creationDate;
}
