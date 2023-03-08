package com.grupogimeno.netadmin.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="location")
public class LocationModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int id_location;

    @Column(unique = true, nullable = false)
    @OneToMany(mappedBy = "location")
    private Set<CompanyModel> CompaniesModel = new HashSet<>();
    private String loc_description;

    @Column(unique = true)
    private String loc_direction;

    @OneToMany(mappedBy = "location")
    private Set<SubnetModel> subnets = new HashSet<>();

    public int getId_location() {
        return id_location;
    }

    public void setId_location(int id_location) {
        this.id_location = id_location;
    }

    public Set<CompanyModel> getCompaniesModel() {
        return CompaniesModel;
    }

    public void setCompaniesModel(Set<CompanyModel> companiesModel) {
        CompaniesModel = companiesModel;
    }

    public String getLoc_description() {
        return loc_description;
    }

    public void setLoc_description(String loc_description) {
        this.loc_description = loc_description;
    }

    public String getLoc_direction() {
        return loc_direction;
    }

    public void setLoc_direction(String loc_direction) {
        this.loc_direction = loc_direction;
    }



    
    
}
