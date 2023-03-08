package com.grupogimeno.netadmin.repositories;
import com.grupogimeno.netadmin.models.HostModel;

//import java.util.List;

//import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HostRepository extends JpaRepository <HostModel, Integer>,JpaSpecificationExecutor<HostModel>{

    //List<HostModel> findAll(Specification<HostModel> specification);

}
