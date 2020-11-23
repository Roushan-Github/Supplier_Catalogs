package com.example.demo;

import com.example.demo.model.Catalog;
import com.example.demo.model.Supplier;
import com.example.demo.pojo.SupplierRequest;
import com.example.demo.pojo.SupplierResponse;
import com.example.demo.repository.SupplierRepository;
import com.example.demo.service.SupplierService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.doCallRealMethod;
import static org.mockito.Mockito.when;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private SupplierService supplierService;

    @MockBean
    private SupplierRepository supplierRepository;

    @Test
    public void saveSupplierDetails() {
        Catalog catalog = new Catalog();
        catalog.setSku_id(11);
        catalog.setSku_name("Samsung Tablet");
        catalog.setSku_description("It consists quad camera");
        catalog.setBrand_name("Samsung Galaxy");
        catalog.setBrand_description("Samsung Tab A Series ");
        List<Catalog> catalogs = new ArrayList<>();
        catalogs.add(catalog);
        Supplier supplier = new Supplier();
        supplier.setSupplier_Id(1);
        supplier.setSupplier_Name("Samsung");
        supplier.setCatalogs(catalogs);
        SupplierRequest supplierRequest = new SupplierRequest();
        supplierRequest.setSupplier(supplier);
        when(supplierService.saveSupplierCatalogsDetails(supplierRequest)).thenReturn(supplier);
    }

    @Test
    public void getSkuName() {
        SupplierResponse supplierResponse = new SupplierResponse();
        supplierResponse.setSku_name("Hp Laptops");
        when(supplierService.getSkuName(9)).thenReturn(supplierResponse);
    }

}
