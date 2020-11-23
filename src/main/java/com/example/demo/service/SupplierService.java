package com.example.demo.service;

import com.example.demo.model.Supplier;
import com.example.demo.pojo.SupplierRequest;
import com.example.demo.pojo.SupplierResponse;
import com.example.demo.repository.CatalogRepository;
import com.example.demo.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SupplierService {
    @Autowired
    private CatalogRepository catalogRepo;
    @Autowired
    private SupplierRepository supplierRepo;

    public Supplier saveSupplierCatalogsDetails(SupplierRequest request) {
        return supplierRepo.save(request.getSupplier());
    }

    public SupplierResponse getSkuName(int id) {

        return supplierRepo.getSkuName(id);
    }
}
