package com.miniProject.ecommerce.web;

import com.miniProject.ecommerce.dao.ProductCategoryRepository;
import com.miniProject.ecommerce.dao.ProductRepository;
import com.miniProject.ecommerce.entity.Product;
import com.miniProject.ecommerce.entity.ProductCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductControl {
    @Autowired
    ProductRepository productRepository;
    @Autowired
    ProductCategoryRepository productCategoryRepository;

    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    @GetMapping("/products/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable("id") Long id){
        Optional<Product> product = productRepository.findById(id);
        if(product.isPresent()){
            return new ResponseEntity<Product>(product.get(), HttpStatus.OK);
        }else {
            return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/product-categories")
    public List<ProductCategory> getAllProductCategories(){
        return (List<ProductCategory>) productCategoryRepository.findAll();
    }

    @GetMapping("/product-categories/{id}")
    public ResponseEntity<ProductCategory> getProductCategoryById(@PathVariable("id") Long id){
        Optional<ProductCategory> productCategory = productCategoryRepository.findById(id);
        if(productCategory.isPresent()){
            return new ResponseEntity<ProductCategory>(productCategory.get(), HttpStatus.OK);
        }else {
            return new ResponseEntity<ProductCategory>(HttpStatus.NOT_FOUND);
        }
    }

}
