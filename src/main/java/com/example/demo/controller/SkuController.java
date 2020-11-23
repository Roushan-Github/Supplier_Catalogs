package com.example.demo.controller;

import com.example.demo.model.Supplier;
import com.example.demo.pojo.SupplierRequest;
import com.example.demo.pojo.SupplierResponse;
import com.example.demo.repository.CatalogRepository;
import com.example.demo.repository.SupplierRepository;
import com.example.demo.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@ResponseBody
public class SkuController {
    @Autowired
    private SupplierService supplierService;

    @PostMapping("/supplierDetails")
    public Supplier supplierDetails(@RequestBody SupplierRequest request) {
        return supplierService.saveSupplierCatalogsDetails(request);
    }

    @GetMapping("/get")
    public SupplierResponse getSkuName(@RequestParam int id) {
        return supplierService.getSkuName(id);
    }

}
