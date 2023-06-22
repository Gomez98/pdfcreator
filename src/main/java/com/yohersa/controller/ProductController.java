package com.yohersa.controller;

import com.yohersa.model.Product;
import com.yohersa.service.ProductService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/product")
@AllArgsConstructor
@Slf4j
public class ProductController {

    private final ProductService productService;

    @GetMapping("/list")
    public List<Product> getAllProducts(){
        return productService.findAllProducts();
    }


    @PostMapping("/save")
    public Product saveProduct(@RequestBody Product product){
        return  productService.saveProduct(product);
    }

}
