package com.grupogimeno.netadmin.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.grupogimeno.netadmin.criteria.HostCritera;
import com.grupogimeno.netadmin.models.HostModel;
import com.grupogimeno.netadmin.models.HostModel_;
import com.grupogimeno.netadmin.repositories.HostRepository;

import io.github.jhipster.service.QueryService;

@Service
@Transactional
public class hostService extends QueryService<HostModel>{
   @Autowired
    HostRepository hostRepository;

    public List<HostModel> findByCriteria (HostCritera hostCritera){
        final Specification<HostModel> specification = createSpecification(hostCritera);
        List<HostModel> hosts = hostRepository.findAll(specification);
        return hosts;
    }
    private Specification<HostModel> createSpecification (HostCritera hostCritera) {
        Specification<HostModel> specification = Specification.where (null);
        if (criteria != null ){
            if(criteria.getHost () != null ){
                specification = specification.and(buildStringSpecification(criteria.getHost(), HostModel_.host));
            }
        }
        return specification;
    }

}
