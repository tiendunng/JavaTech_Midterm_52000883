package com.example.demo.service;

import com.example.demo.dto.ProductDto;
import com.example.demo.module.Product;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
@Configuration
@Service
@Repository
public interface ProductService  {
    void saveProduct(ProductDto productDto);


    Product findByid(BigDecimal id);

    List<ProductDto> findAllProduct();
}