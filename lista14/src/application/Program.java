package application;

import model.entities.Contract;
import model.entities.Installment;
import model.services.InstallmentService;
import model.services.PaypalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


        try {
            System.out.println("Enter contract data: ");
            System.out.print("Number: ");
            Integer num = sc.nextInt();
            System.out.print("Date (dd/MM/yyyy): ");
            sc.nextLine();
            Date date = sdf.parse(sc.nextLine());
            System.out.print("Contract value: ");
            Double value = sc.nextDouble();
            System.out.print("Enter the number of installments: ");
            int numInstallments = sc.nextInt();

            Contract contract = new Contract(num, date, value);
            InstallmentService installmentService = new InstallmentService(new PaypalService());
            installmentService.processInstallment(contract, numInstallments);

            List<Installment> installmentsList = contract.getInstallments();

            System.out.println("Installments: ");
            for(Installment x : installmentsList){
                System.out.println(sdf.format(x.getDueDate()) + " - " +  x.getValue());
            }

        }
        catch (ParseException e){
            System.out.println("oi" + e.getMessage());
        }
    }

}
