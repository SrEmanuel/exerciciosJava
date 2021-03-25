import java.util.Locale;
import java.util.Scanner;

public class exercise02 {
    public static void main(String[] args) {
        /*
        Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
        casas decimais conforme exemplos.
        Fórmula da área: area = π . raio2
        Considere o valor de π = 3.14159
         */
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double raio, pi, resposta;
        pi = 3.14159;
        System.out.println("Digite o valor do raio: ");
        raio = sc.nextFloat();

        resposta = pi * Math.pow(raio, 2);

        System.out.printf("A resposta é: %.4f",resposta);

        sc.close();
    }
}
