package com.miniProject.ecommerce.dao;

import com.miniProject.ecommerce.entity.ProductCategory;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")//protocol+hostname+port
@RepositoryRestResource(collectionResourceRel = "productCategory", path = "product-category")
                        //collectionResource Rel is the json entry name and path varibale is path for calling it: /product-category
public interface ProductCategoryRepository extends CrudRepository<ProductCategory,Long> {
//    public ProductCategory findById(Long id);
}
