package com.grupogimeno.netadmin.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.grupogimeno.netadmin.criteria.HostCritera;
import com.grupogimeno.netadmin.models.HostModel;
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
    /**
     * @param hostCritera
     * @return
     */
    private Specification<HostModel> createSpecification(HostCritera hostCriteria) {
        Specification<HostModel> specification = Specification.where(null);
        if (hostCriteria != null) {
            if (hostCriteria.getHost() != null) {
                specification = specification.and(buildStringSpecification(hostCriteria.getHost(), HostModel_.host));
            }
        }
        return specification;
    }
    
    public ArrayList<HostModel> getHosts() {
        return null;
    }
    public HostModel saveHost(HostModel host) {
        return null;
    }
    public Optional<HostModel> getByIdHost(Integer id_host) {
        return null;
    }
    public ArrayList<HostModel> findByHostBrand(Integer host_brand) {
        return null;
    }
    public boolean deleteHost(Integer id_host) {
        return false;
    }

}
