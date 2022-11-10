package com.miniProject.ecommerce.dao;

import com.miniProject.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")//protocol+hostname+port
public interface ProductRepository extends JpaRepository<Product,Long> {

}
