package application;

import entities.Room;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many rooms will be rented? ");
        int num = sc.nextInt();
        sc.nextLine();
        Room[] vector = new Room[10];

        for(int i=0; i<num; i++){
            System.out.println("Rent #"+(i+1));
            System.out.println("Name: ");
            String name = sc.nextLine();
            System.out.println("Email: ");
            String email = sc.nextLine();
            System.out.println("Room: ");
            int room = sc.nextInt();
            sc.nextLine();
            vector[room] = new Room(name,email);
        }

        System.out.println("Busy rooms: ");
        for(int i= 0; i<vector.length; i++){
            if(vector[i] != null){
                System.out.printf("%d: %s, %s%n",i,vector[i].getHolder(),vector[i].getEmail());
            }
        }
        sc.close();
    }
}
