package com.usercrud.usercrud.controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.usercrud.usercrud.model.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;
@CrossOrigin(origins="httlp://localhost:63342")
@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private ProductServiceImpl productServiceImpl;
    @GetMapping("/")
    public ResponseEntity<List<Products>> getAllProducts() {
      List<Products>  products= productServiceImpl.getAllProducts();
        return ResponseEntity.ok(products);
    }

}
