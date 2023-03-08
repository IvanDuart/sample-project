package com.grupogimeno.netadmin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grupogimeno.netadmin.models.LocationModel;

public interface LocationRepository extends JpaRepository<LocationModel, Integer>{
    
}
