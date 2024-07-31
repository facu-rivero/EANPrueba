package com.mercadona.eanprueba.dto;

import com.mercadona.eanprueba.model.Product;

public class ProductDTOMapper {
    public static ProductDTO toDto(Product product) {
        return new ProductDTO(
                product.getProductCode(),
                product.getProductName(),
                product.getCreationDate()
        );
    }
}
