package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("How many employees will be registered?");
        int num = sc.nextInt();
        sc.nextLine();

        List<Employee> list = new ArrayList<>();

        for(int i=0; i <= num; i++){
            System.out.println("Employee: #" + i);
            System.out.println("ID: ");
            Integer id = sc.nextInt();
            sc.nextLine();
            System.out.println("Name: ");
            String name = sc.nextLine();
            System.out.println("Salary: ");
            Double salary = sc.nextDouble();

            Employee employee = new Employee(id,name,salary);
            list.add(employee);
        }

        System.out.println("Enter the employee id that will have salary increased: ");
        int id = sc.nextInt();
        Employee result = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

        if(result == null){
            System.out.println("ID Inválido!");
        }else{
            System.out.println("Enter the percentage: ");
            Double per = sc.nextDouble();
            result.upSalary(per);
        }

        for(Employee x : list){
            System.out.println(x);
        }

    }
}
