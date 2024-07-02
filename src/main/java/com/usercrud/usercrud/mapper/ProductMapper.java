package com.usercrud.usercrud.mapper;

import com.usercrud.usercrud.dto.ProductsDto;
import com.usercrud.usercrud.model.Products;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    ProductsDto ProductsToProductsDto(Products products);
    List<ProductsDto> ProductsToProductsDto(List<Products> products);
    Products ProductsDtoToProducts(ProductsDto productsDto);
}
