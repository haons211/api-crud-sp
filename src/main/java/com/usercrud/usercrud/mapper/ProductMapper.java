package com.usercrud.usercrud.mapper;

import com.usercrud.usercrud.dto.ProductsDto;
import com.usercrud.usercrud.model.Products;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    ProductsDto ProductsToProductsDto(Products products);
    List<ProductsDto> ProductsToProductsDto(List<Products> products);
   default Products ProductsDtoToProducts(ProductsDto productsDto){
       java.util.Date date = new java.util.Date();
       java.sql.Date sqlDate= new java.sql.Date(date.getTime());
       Products product = new Products();
       product.setTimestamp(sqlDate);
return null;
   };
}
