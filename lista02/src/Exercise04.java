import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        /*
        Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
        começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
         */
        Scanner sc = new Scanner(System.in);

        int hi,hf;
        hi = sc.nextInt();
        hf = sc.nextInt();

        if(hi < hf){
            System.out.printf("Hora jogadas: %d",hf - hi);
        } else{ System.out.printf("Horas jogadas: %d", (24 - hi) + hf); }
        sc.close();

    }
}
