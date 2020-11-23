package com.example.demo.pojo;

import com.example.demo.model.Supplier;

public class SupplierRequest {
    private Supplier supplier;

    public SupplierRequest() {
    }

    public SupplierRequest(Supplier supplier) {
        this.supplier = supplier;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    @Override
    public String toString() {
        return "SupplierRequest{" +
                "supplier=" + supplier +
                '}';
    }
}
