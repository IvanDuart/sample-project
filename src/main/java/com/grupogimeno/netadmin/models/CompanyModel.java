package com.grupogimeno.netadmin.models;

import java.util.*;

import javax.persistence.*;

@Entity
@Table(name = "company")
public class CompanyModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int id_company;

    @Column(unique = true, nullable = false)
    private String company_name;

    @OneToMany(mappedBy = "company")
    private Set<LocationModel> locations = new HashSet<>();

    public int getId_company() {
        return id_company;
    }

    public void setId_company(int id_company) {
        this.id_company = id_company;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }
}
