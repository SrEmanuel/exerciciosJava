package application;


import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    /*
    Fazer um programa para ler os valores da largura e altura
    de um retângulo. Em seguida, mostrar na tela o valor de
    sua área, perímetro e diagonal. Usar uma classe como
    mostrado no projeto ao lado.
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.println("Enter the width and height of the rectangle: ");
        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();

        System.out.println(rectangle);

    }
}
