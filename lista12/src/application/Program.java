package application;

import model.entities.Account;
import model.exceptions.DomainException;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = sc.nextInt();
            sc.nextLine();
            System.out.print("Holder: ");
            String name = sc.nextLine();
            System.out.print("Inital balance: ");
            Double balance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            Double withDrawLimit = sc.nextDouble();

            Account account = new Account(number,name,balance,withDrawLimit);

            System.out.println("Enter amount for withdraw: ");
            account.withDraw(sc.nextDouble());
            System.out.println("New balance: "+ account.getBalance());
        }catch (DomainException e){
            System.out.println("Withdraw error: " + e.getMessage());
        }catch (InputMismatchException e){
            System.out.println("Input error!");
        }

        sc.close();
    }
}
