package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> set = new HashSet<>();

        System.out.print("How many students for course A? ");
        countLoop(sc, set);
        System.out.print("How many students for course B? ");
        countLoop(sc, set);
        System.out.print("How many students for course C? ");
        countLoop(sc, set);

        System.out.println("Total students: " + set.size());
    }

    public static void countLoop(Scanner sc, Set<Integer> set){
        int aux = sc.nextInt();
        for (int i=0; i < aux; i++){
            set.add(sc.nextInt());
        }
    }
}
