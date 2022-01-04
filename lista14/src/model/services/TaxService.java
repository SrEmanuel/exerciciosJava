package model.services;

import model.entities.Contract;

public interface TaxService {

    default double calculate(Double amount, int month){
        return amount * month;
    }
}
