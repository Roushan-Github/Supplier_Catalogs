package com.example.demo.repository;
import java.util.*;
import com.example.demo.model.Supplier;
import com.example.demo.pojo.SupplierResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

public interface SupplierRepository extends JpaRepository<Supplier,Integer> {
  @Query("SELECT new com.example.demo.pojo.SupplierResponse(p.sku_name) FROM Supplier c JOIN c.catalogs p where c.Supplier_Id=:id")
   SupplierResponse getSkuName(@Param("id") int id);

}
