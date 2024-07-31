package com.mercadona.eanprueba.service;

import com.mercadona.eanprueba.dto.ProductDTO;
import com.mercadona.eanprueba.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getAllProducts();

    ProductDTO getById(Long id);

    ProductDTO createProduct(ProductDTO productDTO);

    ProductDTO updateProduct(Long id, ProductDTO productDTO);

    void deleteById(Long id);
}
