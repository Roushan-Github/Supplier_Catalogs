package com.example.demo.repository;

import com.example.demo.model.Catalog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CatalogRepository extends JpaRepository<Catalog,Integer> {
    //@Query("SELECT p FROM Catalog p WHERE sku_name=:skuName")
    @Query("SELECT p FROM Catalog p WHERE sku_name like %?1%")
    List<Catalog> findBySkuName(String skuName);
}
