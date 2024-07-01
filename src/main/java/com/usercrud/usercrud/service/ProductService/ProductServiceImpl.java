package com.usercrud.usercrud.service.ProductService;

import com.usercrud.usercrud.dto.ProductsDto;
import com.usercrud.usercrud.model.Products;
import com.usercrud.usercrud.repository.ProductRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ProductServiceImpl implements ProductService {
    @Autowired
    private final ModelMapper mapper;
    private ProductRepository productRepository;

    @Override
    public List<ProductsDto> getAllProducts() {
        List<Products> products = productRepository.findAll();
        mapper.
        return List.of();
    }

    @Override
    public Optional<ProductsDto> getProductById(Long id) {
        return Optional.empty();
    }

    @Override
    public Products saveProduct(ProductsDto productDto) {
        return null;
    }

    @Override
    public void deleteProduct(Long id) {

    }
}
