package model.services;

import model.entities.Contract;
import model.entities.Installment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class InstallmentService {

    private TaxService taxService;

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public InstallmentService(TaxService taxService) {
        this.taxService = taxService;
    }

    public void processInstallment(Contract contract, int number) throws ParseException {
        Double installmentAmount = contract.getValue()/number;

        for(int i=1; i<=number; i++){
            Date date = addMonth(contract.getAssingDate(), i);
            contract.addInstallment(new Installment(date, taxService.calculate(installmentAmount,i)));
        }
    }

    public Date addMonth(Date date, int n){
        //solution by Nelio Alves

        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MONTH, n);
        return cal.getTime();
    }
}
