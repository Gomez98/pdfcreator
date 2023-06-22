package com.yohersa.service;

import com.yohersa.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> findAllProducts();

    Product saveProduct(Product product);
}
