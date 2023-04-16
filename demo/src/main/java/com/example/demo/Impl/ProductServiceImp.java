package com.example.demo.Impl;

import com.example.demo.dto.ProductDto;
import com.example.demo.module.Product;
import com.example.demo.repository.ProductRepository;
import com.example.demo.service.ProductService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImp implements ProductService {
//    @Autowired
    private ProductRepository productRepository;


    public ProductServiceImp(ProductRepository productRepository) {
        this.productRepository = productRepository;

    }

    @Override
    public void saveProduct(ProductDto productDto) {
        Product product = new Product();
        product.setName(productDto.getName());
        product.setPrice(productDto.getPrice());
        product.setImg(productDto.getImg());
        productRepository.save(product);
    }

    @Override
    public Product findByid(BigDecimal id) {
        return null;
    }

    @Override
    public List<ProductDto> findAllProduct() {
        List<Product> products = productRepository.findAll();
        return products.stream().map((product) -> convertEntityToDto(product))
                .collect(Collectors.toList());
    }


    private ProductDto convertEntityToDto(Product product){
        ProductDto productDto = new ProductDto();
//        String[] name = product.getName().split(" ");
        productDto.setName(product.getName());
        productDto.setPrice(product.getPrice());
        productDto.setImg(product.getImg());
        return productDto;
    }
}
