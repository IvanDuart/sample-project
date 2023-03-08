package com.grupogimeno.netadmin.criteria;

import com.grupogimeno.netadmin.enums.Brand;

import io.github.jhipster.service.filter.Filter;
import io.github.jhipster.service.filter.StringFilter;

public class HostCritera {

    public static class BrandFilter extends Filter<Brand>{}
    private StringFilter host;
    private StringFilter location;
    private StringFilter company;
    private BrandFilter brand;

    public StringFilter getHost() {
        return host;
    }
    public void setHost(StringFilter host) {
        this.host = host;
    }
    public StringFilter getLocation() {
        return location;
    }
    public void setLocation(StringFilter location) {
        this.location = location;
    }
    public StringFilter getCompany() {
        return company;
    }
    public void setCompany(StringFilter company) {
        this.company = company;
    }
    public BrandFilter getBrand() {
        return brand;
    }
    public void setBrand(BrandFilter brand) {
        this.brand = brand;
    }


}
