package com.grupogimeno.netadmin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grupogimeno.netadmin.models.CompanyModel;

@Repository
public interface CompanyRepository extends JpaRepository<CompanyModel, Integer>{
    
}
