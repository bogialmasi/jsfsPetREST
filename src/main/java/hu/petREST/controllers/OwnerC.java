package hu.petREST.controllers;

import hu.petREST.domain.Owner;
import hu.petREST.service.OService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OwnerC {

    @Autowired
    public OService service;

    @PostMapping("/owners")
    public Owner addOwner(@RequestBody Owner o){
        return service.addOwner(o);
    }
}
