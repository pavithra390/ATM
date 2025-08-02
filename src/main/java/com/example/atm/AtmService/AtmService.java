package com.example.atm.AtmService;
import com.example.atm.ATMEntity.AtmDetails;
import com.example.atm.AtmRepo.AtmRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@Service
public class AtmService {
    @Autowired
    AtmRepo ar;
    public void insertOneRecord(AtmDetails atmDetails) {
        ar.save(atmDetails);
    }
    public void insertAllRecord(Iterable<AtmDetails> atmDetails) {
        ar.saveAll(atmDetails);
    }
    public Optional<AtmDetails> getRecordById(int id) {
        return ar.findById(id);
    }
    public Iterable<AtmDetails> getAllRecors() {
        return ar.findAll();
    }
    public void deleteRecordById(int id) {
         ar.deleteById(id);
    }
    public void deleteAllRecors() {
        ar.deleteAll();
    }

}
