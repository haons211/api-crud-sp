package com.usercrud.usercrud.service.ProductService;
import com.usercrud.usercrud.dto.ProductsDto;
import com.usercrud.usercrud.model.Products;

import java.util.List;
import java.util.Optional;

public interface ProductService
{
    List<ProductsDto> getAllProducts();
    Optional<ProductsDto> getProductById(Long id);
    Products saveProduct(ProductsDto productDto);
    void deleteProduct(Long id);

}
