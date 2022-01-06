package application;

import Entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {
    /*
    Fazer um programa para ler os dados (nome, email e salário)
    de funcionários a partir de um arquivo em formato .csv.
    Em seguida mostrar, em ordem alfabética, o email dos
    funcionários cujo salário seja superior a um dado valor
    fornecido pelo usuário.
    Mostrar também a soma dos salários dos funcionários cujo
    nome começa com a letra 'M'.

    https://github.com/acenelio/lambda7-java
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.print("Enter full file path: ");
        String path = sc.next();

        List<Employee> list = new ArrayList<>();


        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                String[] splited = line.split(",");
                list.add(new Employee(splited[0], splited[1], Double.parseDouble(splited[2])));
                line = br.readLine();
            }

            List<String> emails = list.stream()
                    .filter(x -> x.getSalary() > 2000.0)
                    .map(x -> x.getEmail())
                    .sorted((s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase()))
                    .collect(Collectors.toList());

            List<Double> salary = list.stream()
                    .filter(x -> x.getName().charAt(0) == 'M')
                    .map(x -> x.getSalary())
                    .collect(Collectors.toList());

            System.out.println("Email of people whose salary is more than 2000.0: ");
            emails.forEach(System.out::println);
            Double totalSalary = 0.0;
            for(Double x : salary){
                totalSalary += x;
            }

            System.out.println("Sum of salary of people whose name starts with 'M': " + totalSalary);

        }catch (IOException e){
            System.out.println(e.getMessage());
        }



    }
}
