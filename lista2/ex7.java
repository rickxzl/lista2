import java.util.Scanner;

public class ex7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        System.out.println("digite o numero");
        numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println("O numero é positivo");
        }

        else if (numero < 0) {
            System.out.println("o numero é negativo");
        } else {
            System.out.println("o numero é zero");
        }
    }
}
