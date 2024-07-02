package com.usercrud.usercrud.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

import java.sql.Date;

@Data
public class ProductsDto {

    @NotEmpty(message="Thieu phan o ta")
    private String description;
    @NotEmpty(message="Thieu ten san pham")
    private String name;
    @NotEmpty(message="Thieu gia san pham")
    private Double price;
    @NotEmpty(message="Thieu so luong")
    @Min(value=1, message="So luong phai lon hon 1")
    private Long quantity;

}
