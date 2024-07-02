package com.usercrud.usercrud.service.ProductService;

import com.usercrud.usercrud.dto.ProductsDto;
import com.usercrud.usercrud.model.Products;
import com.usercrud.usercrud.repository.ProductRepository;
import com.usercrud.usercrud.mapper.ProductMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ProductMapper productMapper;


    @Override
    public List<ProductsDto> getAllProducts() {
        return productMapper.ProductsToProductsDto(productRepository.findAll());
    }

    @Override
    public Optional<ProductsDto> getProductById(Long id) {
        return Optional.empty();
    }

    @Override
    public Products saveProduct(ProductsDto productDto) {
        return productRepository.save(productMapper.ProductsDtoToProducts(productDto));
    }

    @Override
    public void deleteProduct(Long id) {

    }
}
