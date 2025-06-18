package com.spring.ecommerce.Product_Service.service;

import com.spring.ecommerce.Product_Service.model.Product;
import com.spring.ecommerce.Product_Service.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    public boolean isAvailable(Long id) {
        Product product = productRepository.findById(id).orElse(null);
        if(product != null){
            System.out.println("Product service - isAvailable()");
            return product.getStock() > 0;
        }
        throw new RuntimeException("Product not available");
    }

    public Product updateProduct(Long id, Product product) {
        product.setId(id);
        return productRepository.save(product);
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}

