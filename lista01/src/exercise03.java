import java.util.Scanner;

public class exercise03 {
    public static void main(String[] args) {
        /*
        Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
        casas decimais conforme exemplos.
        Fórmula da área: area = π . raio2
        Considere o valor de π = 3.14159
         */

        Scanner sc = new Scanner(System.in);

        int A, B, C, D, resposta;

        System.out.println("Digite o valor de A, B, C e D respectivamente: ");
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        resposta = (A * B - C * D);

        System.out.println("A resposta é: "+ resposta);
        sc.close();
    }
}
