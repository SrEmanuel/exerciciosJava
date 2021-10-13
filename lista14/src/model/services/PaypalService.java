package model.services;


public class PaypalService implements TaxService{


    @Override
    public double calculate(Double amount, int month) {
        Double aux = amount + (amount * 0.01) * month;
        return aux + (aux *0.02);
    }
}
