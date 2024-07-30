package com.mercadona.eanprueba.model;

import jakarta.persistence.Entity;
import com.mercadona.eanprueba.model.Provider;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor

public class EANCode {
    @Id
    private Long id;
    Provider provider;
    private Product product;
    private Destination destination;
}
