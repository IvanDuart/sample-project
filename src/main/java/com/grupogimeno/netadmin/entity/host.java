package com.grupogimeno.netadmin.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="host")

public class host {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_host")
    private int id_host;

    @Column(name="host_type")
    private int host_type;

    @Column(name="host_name")
    private String host_name;

    @Column(name="host_location")
    private int host_location;

    @Column(name="host_brand")
    private int host_brand;

    @Column(name="host_model")
    private String host_model;

    @Column(name="host_description")
    private String host_description;

    @Column(name="ip")
    private String ip;

    public host() {}

    public host(int id_host, int host_type, String host_name, int host_location, int host_brand, String host_model, String host_description, String ip) {
        this.id_host = id_host;
        this.host_type = host_type;
        this.host_name = host_name;
        this.host_location = host_location;
        this.host_brand = host_brand;
        this.host_model = host_model;
        this.host_description = host_description;
        this.ip = ip;
    }

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

    @Override
    public String toString() {
        return "Host [id=" + id_host + ", host_name=" + host_name + ", host_description=" + host_description + ", ip=" + ip + ", host_model=" + host_model + "]";
    }
}

