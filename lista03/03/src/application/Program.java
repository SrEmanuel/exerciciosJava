package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.println("Enter the Student's name: ");
        student.name = sc.nextLine();
        System.out.println("Enter the grades for the first, second and third semester: ");
        student.t1 = sc.nextDouble();
        student.t2 = sc.nextDouble();
        student.t3 = sc.nextDouble();

        System.out.println(student.name+ "'s final grade: " + student.finalGrade());
        if (student.finalGrade() < 60.0) {
            System.out.println("FALIED");
            System.out.println("MISSING: " + student.missingPoints() + " POINTS");
        } else{
            System.out.println("PASS");
        }
        sc.close();
    }
}
