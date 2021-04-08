package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the account number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder name: ");
        String name = sc.nextLine();

        System.out.print("Is there an initial deposit value (y/n)? ");
        char option = sc.next().charAt(0);

        Account account = new Account(name, accountNumber);
        if(option == 'y'){
            System.out.print("\nEnter the initial deposit value: ");
            account.depositValue(sc.nextDouble());
        }
        System.out.println("\nAccount data: ");
        System.out.println(account);

        System.out.print("\nEnter a deposit value: ");
        account.depositValue(sc.nextDouble());
        updated(account);

        System.out.print("Enter a withdraw value: ");
        account.withdrawValue(sc.nextDouble());
        updated(account);
    }
    public static void updated(Account account){
        System.out.println("Updated account data: ");
        System.out.println(account);
    }

}
