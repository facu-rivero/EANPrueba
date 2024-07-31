package com.mercadona.eanprueba.controller;

import com.mercadona.eanprueba.dto.DestinationDTO;
import com.mercadona.eanprueba.dto.ProductDTO;
import com.mercadona.eanprueba.model.Destination;
import com.mercadona.eanprueba.model.Product;
import com.mercadona.eanprueba.service.DestinationService;
import com.mercadona.eanprueba.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
@RequestMapping("v1/api/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping()
    public ResponseEntity<List<Product>> getAllProducts () {

        List <Product> Products = productService.getAllProducts();

        return ResponseEntity.ok(Products);
    }

    @GetMapping("{id}")
    public ResponseEntity<ProductDTO> getById(@PathVariable Long id) throws NoSuchElementException {

        Optional<ProductDTO> product = Optional.ofNullable(productService.getById(id));
        if (!product.isPresent()) {
            throw new NoSuchElementException("El Id indicado no existe.");
        }
        return ResponseEntity.ok(product.get());
    }

    @PostMapping()
    public ResponseEntity<ProductDTO> createProduct(@RequestBody ProductDTO productDTO) {
        ProductDTO newProduct = productService.createProduct(productDTO);

        return ResponseEntity.status(HttpStatus.CREATED).body(newProduct);
    }

    @PutMapping("{id}")
    public ResponseEntity<ProductDTO> updateProduct(@PathVariable Long id, @RequestBody ProductDTO productDTO) {

        if(productService.getById(id) == null) {
            return ResponseEntity.notFound().build();
        }
        ProductDTO result = productService.updateProduct(id,productDTO);
        return ResponseEntity.accepted().body(result);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id) {

        if(productService.getById(id) == null) {
            return ResponseEntity.notFound().build();
        }
        productService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
