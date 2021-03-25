import java.util.Locale;
import java.util.Scanner;

public class exercise06 {
    public static void main(String[] args) {
        /*
        Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
        mostre:
        a) a área do triângulo retângulo que tem A por base e C por altura.
        b) a área do círculo de raio C. (pi = 3.14159)
        c) a área do trapézio que tem A e B por bases e C por altura.
        d) a área do quadrado que tem lado B.
        e) a área do retângulo que tem lados A e B.
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C, resposta, pi = 3.14159;

        System.out.println("Digite os valores de A, B e C: ");
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        resposta = (A * C) / 2.0;
        System.out.printf("TRIANGULO: %.3f%n", resposta);

        resposta = pi * Math.pow(C, 2);
        System.out.printf("CIRCULO: %.3f%n", resposta);

        resposta = ((A + B) * C ) /2;
        System.out.printf("TRAPESIO: %.3f%n", resposta);

        resposta = (B * B);
        System.out.printf("QUADRADO: %.3f%n", resposta);

        resposta = (A * B);
        System.out.printf("RETANGULO: %.3f%n", resposta);

        sc.close();
    }
}
