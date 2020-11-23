package com.example.demo.model;
import javax.persistence.*;
import java.util.List;

@Entity
public class Supplier {
    @Id
    @GeneratedValue
    private int Supplier_Id;
    private String Supplier_Name;
    @OneToMany(targetEntity = Catalog.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="supplier_fk",referencedColumnName = "Supplier_Id")
    private List<Catalog> catalogs;

    public Supplier() {
    }

    public Supplier(int supplier_Id, String supplier_Name, List<Catalog> catalogs) {
        Supplier_Id = supplier_Id;
        Supplier_Name = supplier_Name;
        this.catalogs = catalogs;
    }

    public int getSupplier_Id() {
        return Supplier_Id;
    }

    public void setSupplier_Id(int supplier_Id) {
        Supplier_Id = supplier_Id;
    }

    public String getSupplier_Name() {
        return Supplier_Name;
    }

    public void setSupplier_Name(String supplier_Name) {
        Supplier_Name = supplier_Name;
    }

    public List<Catalog> getCatalogs() {
        return catalogs;
    }

    public void setCatalogs(List<Catalog> catalogs) {
        this.catalogs = catalogs;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "Supplier_Id=" + Supplier_Id +
                ", Supplier_Name='" + Supplier_Name + '\'' +
                ", catalogs=" + catalogs +
                '}';
    }
}
