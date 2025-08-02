package com.example.atm.AtmRepo;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.atm.ATMEntity.AtmDetails;

public interface AtmRepo extends MongoRepository<AtmDetails,Integer> {
}
