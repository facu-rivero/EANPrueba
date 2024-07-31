package com.mercadona.eanprueba.service.implement;

import com.mercadona.eanprueba.dto.ProductDTO;
import com.mercadona.eanprueba.dto.ProductDTOMapper;
import com.mercadona.eanprueba.model.Product;
import com.mercadona.eanprueba.repository.ProductRepository;
import com.mercadona.eanprueba.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        List<Product> products = productRepository.findAll();

        return products;
    }

    @Override
    public ProductDTO getById(Long id) {

        Optional<Product> productOptional = productRepository.findById(id);

        Product product = productOptional.get();
        return ProductDTOMapper.toDto(product);
    }

    @Override
    public ProductDTO createProduct(ProductDTO productDTO) {

        Product product = new Product();
        product.setProductCode(productDTO.getProductCode());
        product.setProductName(productDTO.getProductName());
        product.setCreationDate(LocalDate.now());

        Product result = productRepository.save(product);

        return ProductDTOMapper.toDto(result);
    }

    @Override
    public ProductDTO updateProduct(Long id, ProductDTO productDTO) {

        Product product = productRepository.findById(id).get();
        product.setProductCode(productDTO.getProductCode());
        product.setProductName(productDTO.getProductName());

        Product result = productRepository.save(product);
        return ProductDTOMapper.toDto(result);
    }

    @Override
    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }
}
