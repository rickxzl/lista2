import java.util.Scanner;
public class ex06 {

    public static void main(String[] args) {

        int numero1, numero2; 

        System.out.println("Digite o primeiro numero:");
        Scanner scanner = new Scanner(System.in);
        numero1 = scanner.nextInt();
        System.out.println("Digite o segundo numero:");
        numero2 = scanner.nextInt();

        if(+numero1 > numero2)
        {
            System.out.println("O primeiro número é maior.");
        }
        else
        {
            System.out.println("O segundo número é maior.");
        }

    }
}