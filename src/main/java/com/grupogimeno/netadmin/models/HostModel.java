package com.grupogimeno.netadmin.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
//import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.grupogimeno.netadmin.enums.Brand;

///import com.grupogimeno.netadmin.entity.host;

@Entity
@Table(name= "host")
public class HostModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int id_host;

    @Column(unique = true, nullable = false)
    private String host_name;
    private String host_model;
    private String host_description;
    private String ip;

    @OneToMany(mappedBy = "host")
    private Set<HostTypeModel> hostsTypes = new HashSet<>();

    @ManyToOne(optional = false)
    private Set<LocationModel> hostsLocations = new HashSet<>();


    /*@OneToOne(optional = false)
    private Set<Brand> brands = new HashSet<>();*/
    @Enumerated (EnumType.STRING)
    private Brand brand;
    
    
    public int getId() {
        return id_host ;
    }

    public void setId(int id_host) {
        this.id_host  = id_host ;
    }

    public String getHostName() {
        return host_name;
    }

    public void setHostName(String host_name) {
        this.host_name = host_name;
    }

    public String getHostModel() {
        return host_model;
    }

    public void setHostModel(String host_model) {
        this.host_model = host_model;
    }

    public String getHostDescription() {
        return host_description;
    }

    public void setHostDescription(String host_description) {
        this.host_description = host_description;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

}
