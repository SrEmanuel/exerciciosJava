package model.entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Installment {
    private Date dueDate;
    private Double value;

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Installment(String dueDate, Double value) throws ParseException {
        this.dueDate = sdf.parse(dueDate);
        this.value = value;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public Double getValue() {
        return value;
    }
}


