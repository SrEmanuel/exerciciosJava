package application;

import entities.Company;
import entities.Individual;
import entities.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of tax payers: ");
        int payers = sc.nextInt();

        List<Person> list = new ArrayList<>();


        for(int i=0; i < payers; i++){
            System.out.println("Tax payer #"+ (i+1) + " data: ");
            System.out.print("Individual or company (i/c)? ");
            char answer = sc.next().charAt(0);

            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Anual income: ");
            double income = sc.nextDouble();
            if(answer == 'i'){
                System.out.print("Health expenditures: ");
                Double expenditures = sc.nextDouble();
                list.add(new Individual(name, income, expenditures));

            }else if(answer == 'c') {
                System.out.print("Number of employees: ");
                int employees = sc.nextInt();
                list.add(new Company(name, income, employees));
            }
        }

        System.out.println("TAXES PAID: ");
        Double totalTaxes = 0.00;
        for (Person x : list){
            totalTaxes += x.tax();
            System.out.println(x.getName()+ ": $ " + String.format("%.2f", x.tax()));
        }

        System.out.println("Total Taxes: $" + totalTaxes);





    }
}
