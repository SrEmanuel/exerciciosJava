package model.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {
    private Integer number;
    private Date assingDate;
    private Double value;

    private List<Installment> installmentsToPay = new ArrayList<>();

    public Contract(Integer number, Date assingDate, Double value) {
        this.number = number;
        this.assingDate = assingDate;
        this.value = value;
    }

    public Integer getNumber() {
        return number;
    }

    public Date getAssingDate() {
        return assingDate;
    }

    public Double getValue() {
        return value;
    }

    public List<Installment> getInstallments() {
        return installmentsToPay;
    }

    public void addInstallment(Installment installment){
        installmentsToPay.add(installment);
    }

    public void removeInstallment(Installment installment){
        installmentsToPay.remove(installment);
    }
}
