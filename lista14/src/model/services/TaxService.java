package model.services;

import model.entities.Contract;

public interface TaxService {

    double calculate(Double amount, int month);
}
