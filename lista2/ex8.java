import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int num1, num2, resto;

        System.out.print("Digite o primeiro número: ");
        num1 = leia.nextInt();

        System.out.print("Digite o segundo número: ");
        num2 = leia.nextInt();

        resto = num1 % num2;

        if (resto == 0) {
            System.out.println("Divisão Exata");
        } else {
            System.out.println("O resto da divisão é: " + resto);
        }

    }
}