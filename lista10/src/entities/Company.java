package entities;

public class Company extends Person{
    private Integer employeesNumber;

    public Company(String name, double annualIncome, Integer employeesNumber) {
        super(name, annualIncome);
        this.employeesNumber = employeesNumber;
    }

    public Integer getEmployeesNumber() {
        return employeesNumber;
    }

    public void setEmployeesNumber(Integer employeesNumber) {
        this.employeesNumber = employeesNumber;
    }

    @Override
    public Double tax() {
        double tax;

        if (employeesNumber > 10)
            tax = getAnnualIncome() * 0.14;
        else
            tax = getAnnualIncome() * 0.16;

        return tax;
    }

}
