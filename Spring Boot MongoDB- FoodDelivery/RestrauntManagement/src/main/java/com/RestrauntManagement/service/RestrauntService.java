package com.RestrauntManagement.service;

import com.RestrauntManagement.dao.RestrauntRepository;
import com.RestrauntManagement.model.RestrauntDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RestrauntService {

    @Autowired
    RestrauntRepository repo;

    public RestrauntDetails addRestraunt(RestrauntDetails restrauntDetails){
        return repo.save(restrauntDetails);
    }
}
