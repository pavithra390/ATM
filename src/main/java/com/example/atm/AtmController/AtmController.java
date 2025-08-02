package com.example.atm.AtmController;
import com.example.atm.ATMEntity.AtmDetails;
import com.example.atm.AtmService.AtmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class AtmController {
    @Autowired
    private AtmService as;
    @PostMapping("/adding/onerecord")
    //@ResponseBody
    //http://localhost:1991/adding/onerecord
    public String addRecord(@RequestBody AtmDetails atm) {
        as.insertOneRecord(atm);
        return "Record added successfully";
    }
    @PostMapping("/adding/allrecords")
    //http://localhost:1991/adding/allrecords
    public String addingAllRecords(@RequestBody Iterable<AtmDetails> atmDetails) {
        as.insertAllRecord(atmDetails);
        return "Record added successfully";
    }
    @GetMapping("/getting/onerecord/{atm_id}")
    //http://localhost:1991/getting/onerecord/11
    public Optional<AtmDetails> gettingOneRecord(@PathVariable("atm_id") int id) {
        return as.getRecordById(id);
    }
    @GetMapping("/getting/allrecords")
    //http://localhost:1991/getting/allrecords
    public Iterable<AtmDetails> gettingAllRecord() {
        return as.getAllRecors();
    }
    @DeleteMapping("/delete/onerecord/{atm_id}")
    //http://localhost:1991/delete/onerecord
    public String deletingOneRecord(@PathVariable("atm_id")int id) {
        as.deleteRecordById(id);
        return "Record deleted successfully";
    }
    @DeleteMapping("/delete/allrecords")
    //http://localhost:1991/delete/allrecords
    public String deletedAllRecords() {
        as.deleteAllRecors();
        return "All Records deleted successfully";
    }

}
