package entities;

public class Employee {
    private final Integer id;
    private final String name;
    private Double salary;

    public Integer getId() {
        return this.id;
    }

    public void upSalary(Double percentage) { this.salary += this.salary * percentage/100; }

    public Employee(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String toString(){
        return this.id +", " + this.name +", " + this.salary;
    }
}
