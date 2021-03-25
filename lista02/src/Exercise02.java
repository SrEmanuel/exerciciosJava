import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        //Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não

        Scanner sc = new Scanner(System.in);

        int x;

        System.out.println("Digite um inteiro: ");
        x = sc.nextInt();

        if(x % 2 == 1){
            System.out.println("IMPAR");
        }else{
            System.out.println("PAR");
        }
        sc.close();
    }
}
