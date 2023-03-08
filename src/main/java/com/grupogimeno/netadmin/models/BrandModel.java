package com.grupogimeno.netadmin.models;

import javax.persistence.*;

@Entity
@Table(name= "brand")
public class BrandModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int id_brand;

    @Column(unique = true, nullable = false)
    private String brand_description;

    public int getId_brand() {
        return id_brand;
    }

    public void setId_brand(int id_brand) {
        this.id_brand = id_brand;
    }

    public String getBrand_description() {
        return brand_description;
    }

    public void setBrand_description(String brand_description) {
        this.brand_description = brand_description;
    }
    
}
