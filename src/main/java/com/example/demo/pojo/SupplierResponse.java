package com.example.demo.pojo;

public class SupplierResponse {
    private String sku_name;

    public SupplierResponse() {
    }

    public SupplierResponse(String sku_name) {
        this.sku_name = sku_name;
    }

    public String getSku_name() {

        return sku_name;
    }

    public void setSku_name(String sku_name) {
        this.sku_name = sku_name;
    }

    @Override
    public String toString() {
        return "SupplierResponse{" +
                "sku_name='" + sku_name + '\'' +
                '}';
    }
}
