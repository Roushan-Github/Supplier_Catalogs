package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Catalog {
    @Id
    private int sku_id;
    private String sku_name;
    private String sku_description;
    private String brand_name;
    private String brand_description;

    public Catalog() {
    }

    public Catalog(int sku_id, String sku_name, String sku_description, String brand_name, String brand_description) {
        this.sku_id = sku_id;
        this.sku_name = sku_name;
        this.sku_description = sku_description;
        this.brand_name = brand_name;
        this.brand_description = brand_description;
    }

    public int getSku_id() {
        return sku_id;
    }

    public void setSku_id(int sku_id) {
        this.sku_id = sku_id;
    }

    public String getSku_name() {
        return sku_name;
    }

    public void setSku_name(String sku_name) {
        this.sku_name = sku_name;
    }

    public String getSku_description() {
        return sku_description;
    }

    public void setSku_description(String sku_description) {
        this.sku_description = sku_description;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public String getBrand_description() {
        return brand_description;
    }

    public void setBrand_description(String brand_description) {
        this.brand_description = brand_description;
    }

    @Override
    public String toString() {
        return "Catalog{" +
                "sku_id=" + sku_id +
                ", sku_name='" + sku_name + '\'' +
                ", sku_description='" + sku_description + '\'' +
                ", brand_name='" + brand_name + '\'' +
                ", brand_description='" + brand_description + '\'' +
                '}';
    }
}
