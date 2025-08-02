package com.example.atm.ATMEntity;
import org.springframework.data.mongodb.core.mapping.Document;
@Document("atm_status")
public class AtmStatus {
    int atmStatusId;
    String isWorking;
    String underMaintenance;
    String moneyAvailable;
}
