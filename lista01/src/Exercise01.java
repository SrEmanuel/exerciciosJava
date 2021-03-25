import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        /*
        Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
        mensagem explicativa, conforme exemplos.
         */
        Scanner sc = new Scanner(System.in);
        int x , y, r;

        System.out.println("Digite o primeiro valor: ");
        x = sc.nextInt();
        System.out.println("Digite o segundo valor: ");
        y = sc.nextInt();

        r = x + y;

        System.out.println("A soma foi: " +r);

        sc.close(); //Não pode esquecer do close.

    }
}
