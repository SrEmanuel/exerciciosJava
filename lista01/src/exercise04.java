import java.util.Locale;
import java.util.Scanner;

public class exercise04 {
    public static void main(String[] args) {
        /*
        Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
        hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
        decimais.
         */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        double horas, phora, salario;

        System.out.println("Digite o numero desse funcionario, o número de horas trabalhadas e o quanto o funcionario recebe por hora: ");
        n = sc.nextInt();
        horas = sc.nextDouble();
        phora = sc.nextDouble();

        salario = horas * phora;

        System.out.println("NUMBER = "+ n);
        System.out.println("SALARY = "+ salario);

        sc.close();
    }
}
