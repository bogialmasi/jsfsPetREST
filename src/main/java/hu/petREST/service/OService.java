package hu.petREST.service;

import hu.petREST.domain.Owner;
import hu.petREST.repo.ORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OService {

    @Autowired
    private ORepository repo;

    public Owner addOwner(Owner o) {
        return repo.save(o);
    }
}
