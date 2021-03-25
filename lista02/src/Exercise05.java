import java.util.Locale;
import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        /*
        Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
        seguir, calcule e mostre o valor da conta a pagar.
         */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Informe o item que deseja comprar e o preço: ");
        double price = 0;
        int item = sc.nextInt();
        int qntd = sc.nextInt();

        if (item == 1){
            price = 4.00 * qntd;
        } else if (item == 2){
            price = 4.50 * qntd;
        } else if (item == 3){
            price = 5.00 * qntd;
        } else if (item == 4){
            price = 2.00 * qntd;
        } else if (item == 5){
            price = 1.50 * qntd;
        }

        System.out.println("O preço final é: "+ price);
        sc.close();

    }
}
