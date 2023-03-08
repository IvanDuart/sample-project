package com.grupogimeno.netadmin.models;

import javax.persistence.*;


@Entity
@Table(name= "type")
public class HostTypeModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int id_type;

    @Column(unique = true, nullable = false)
    @ManyToOne (optional = false)
    private String type_description;

    public int getId_type() {
        return id_type;
    }

    public void setId_type(int id_type) {
        this.id_type = id_type;
    }

    public String getType_description() {
        return type_description;
    }

    public void setType_description(String type_description) {
        this.type_description = type_description;
    }
}
