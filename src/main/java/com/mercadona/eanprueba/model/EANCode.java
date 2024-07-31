package com.mercadona.eanprueba.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EANCode {

    private Provider provider;
    private Product product;
    private Destination destination;

    public EANCode() {
        this.provider = new Provider();
        this.product = new Product();
        this.destination = new Destination();
    }
}
