package com.mercadona.eanprueba.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EANCode {

    private Provider provider;
    private Product product;
    private Destination destination;
}
