package model.entities;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Installment {
    private Date dueDate;
    private Double value;

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Installment(Date dueDate, Double value) {
        this.dueDate = dueDate;
        this.value = value;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public Double getValue() {
        return value;
    }
}


