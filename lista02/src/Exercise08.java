import java.util.Locale;
import java.util.Scanner;

public class Exercise08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario;

        System.out.println("Digite o seu salário: ");
        salario = sc.nextDouble();

        double imp;
        if (salario <=2000.0){
            imp = 0.0;
        } else if (salario <= 3000.0){
            imp = (salario - 2000.0) * 0.08;
        } else if (salario <= 4500.0){
            imp = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
        } else {
            imp = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }

        if (imp == 0.0){
            System.out.println("Isento");

        } else {
            System.out.printf("R$ %.2f de imposto %n", imp);
        }
        sc.close();

    }
}
