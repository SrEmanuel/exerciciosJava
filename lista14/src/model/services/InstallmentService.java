package model.services;

import model.entities.Contract;
import model.entities.Installment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class InstallmentService {

    private TaxService taxService;

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public InstallmentService(TaxService taxService) {
        this.taxService = taxService;
    }

    public void processInstallment(Contract contract, int number) throws ParseException {
        //there's a big gambiarra ahead. proceed carefully

        Double installmentAmount = contract.getValue()/number;
        Date auxMonth = contract.getAssingDate();
        for(int i=1; i<=number; i++){
            auxMonth.setMonth(auxMonth.getMonth() + 1);
            contract.addInstallment(new Installment(sdf.format(auxMonth), taxService.calculate(installmentAmount,i)));
        }
    }
}
