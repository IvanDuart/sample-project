package com.grupogimeno.netadmin.controller;
import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.grupogimeno.netadmin.models.HostModel;
import com.grupogimeno.netadmin.service.hostService;

@RestController
@RequestMapping("/hosts")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.PUT,RequestMethod.POST})

public class hostController {
    @Autowired
    hostService hostService;

    @GetMapping()
    public ArrayList<HostModel> getHosts(){
        return hostService.getHosts();
    }

    @PostMapping()
    public HostModel saveHost(@RequestBody HostModel host){
        return this.hostService.saveHost(host);
    }

   @GetMapping(path = "/hosts/{id_host}")
    public Optional<HostModel> getHostById(@PathVariable("id_host") Integer id_host){
        return this.hostService.getByIdHost(id_host);
    }

    @GetMapping(path = "/query")
    public ArrayList<HostModel> getHostByBrand(@RequestParam("host_brand") Integer host_brand){
        return this.hostService.findByHostBrand(host_brand);
    }

    @DeleteMapping ( path = "/hosts/{id_host}")
    public String deleteById(@PathVariable("id_host") Integer id_host){
        boolean ok = this.hostService.deleteHost(id_host);
        if (ok){
            return "Se eliminó el host " + id_host;
        }else{
            return "No se pudo eliminar el host";
        }
    }

}
