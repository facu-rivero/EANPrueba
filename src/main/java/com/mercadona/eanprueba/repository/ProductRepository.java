package com.mercadona.eanprueba.repository;

import com.mercadona.eanprueba.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository <Product,Long> {
    Product findByProductCode(Integer productCode);
}
