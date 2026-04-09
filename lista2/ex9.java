import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double valor, valorFinal;

        System.out.print("Digite o valor da compra: ");
        valor = leia.nextDouble();

        if (valor > 100) {
            valorFinal = valor - (valor * 0.10);
            System.out.println("Desconto aplicado.");
            System.out.println("Valor final: " + valorFinal);
        } else {
            System.out.println("Sem desconto.");
            System.out.println("Valor final: " + valor);
        }

    }
}