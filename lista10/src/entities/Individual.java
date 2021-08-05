package entities;

public class Individual extends Person{
    private Double healthExpenses;

    public Individual(String name, double annualIncome, Double healthExpenses) {
        super(name, annualIncome);
        this.healthExpenses = healthExpenses;
    }

    public Double getHealthExpenses() {
        return healthExpenses;
    }

    public void setHealthExpenses(Double healthExpenses) {
        this.healthExpenses = healthExpenses;
    }

    @Override
    public Double tax() {
        double tax;

        if (getAnnualIncome() > 20.000)
            tax = getAnnualIncome() * 0.25;
        else
            tax = getAnnualIncome() * 0.15;

        if(healthExpenses != null)
            tax -= healthExpenses * 0.50;

        return tax;
    }



}


