package com.grupogimeno.netadmin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.grupogimeno.netadmin.models.LocationModel;
import com.grupogimeno.netadmin.repositories.LocationRepository;

@Service
@Transactional
public class LocationService {
    @Autowired
    LocationRepository locationRepository;
    public List<LocationModel> findAll(){
        return locationRepository.findAll();
    }
}
