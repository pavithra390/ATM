package com.example.atm.ATMEntity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("atm_details")
public class AtmDetails {
    @Id
    private int atmId;
    private String atmLocationState;
    private String atmLocationCity;
    private String bankName;
    private String atmStatus;
    public AtmDetails(){}
    public AtmDetails(int atmId, String atmLocationState, String atmLocationCity, String bankName, String atmStatus) {
        this.atmId = atmId;
        this.atmLocationState = atmLocationState;
        this.atmLocationCity = atmLocationCity;
        this.bankName = bankName;
        this.atmStatus = atmStatus;
    }


    public String getAtmStatus() {
        return atmStatus;
    }
    public void setAtmStatus(String atmStatus) {
        this.atmStatus = atmStatus;
    }
    public String getBankName() {
        return bankName;
    }
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
    public String getAtmLocationCity() {
        return atmLocationCity;
    }

    public void setAtmLocationCity(String atmLocationCity) {
        this.atmLocationCity = atmLocationCity;
    }

    public String getAtmLocationState() {
        return atmLocationState;
    }

    public void setAtmLocationState(String atmLocationState) {
        this.atmLocationState = atmLocationState;
    }

    public int getAtmId() {
        return atmId;
    }

    public void setAtmId(int atmId) {
        this.atmId = atmId;
    }




}
