package com.grupogimeno.netadmin.models;

import javax.persistence.*;

@Entity
@Table(name = "subnet")
public class SubnetModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int id_subnet;
    
    @Column(unique = true, nullable = false)
    @ManyToOne (optional = false)
    private String subnet;

    @Column(unique = false)
    private int bits;

    public int getId_subnet() {
        return id_subnet;
    }

    public void setId_subnet(int id_subnet) {
        this.id_subnet = id_subnet;
    }

    public String getSubnet() {
        return subnet;
    }

    public void setSubnet(String subnet) {
        this.subnet = subnet;
    }

    public int getBits() {
        return bits;
    }

    public void setBits(int bits) {
        this.bits = bits;
    }

}
