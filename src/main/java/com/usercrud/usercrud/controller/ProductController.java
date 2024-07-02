package com.usercrud.usercrud.controller;
import com.usercrud.usercrud.dto.ProductsDto;
import com.usercrud.usercrud.service.ProductService.ProductServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.usercrud.usercrud.model.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;


import java.util.List;
@CrossOrigin(origins="httlp://localhost:63342")
@RestController
@RequestMapping("/api/v1")
public class ProductController {
    @Autowired
    private ProductServiceImpl productServiceImpl;

    @GetMapping("/products")
    public ResponseEntity<List<ProductsDto>> getAllProducts() {
        return ResponseEntity.ok(productServiceImpl.getAllProducts());
    }

    @PostMapping("/create")
    public ResponseEntity<?> createProduct(@RequestBody ProductsDto productsDto) {
        return ResponseEntity.status(HttpStatus.OK).body(productServiceImpl.saveProduct(productsDto));
    }

}
