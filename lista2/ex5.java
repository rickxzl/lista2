import java.util.Scanner;
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    int numero;

    System.out.println("Digite um numero:");
    numero = scanner.nextInt();

     if (numero % 2 == 0 && numero % 3 == 0) {
            System.out.println("O número é divisível por 2 e por 3 ao mesmo tempo.");
        } else {
            System.out.println("O número não é divisível por 2 e por 3 ao mesmo tempo.");
        }


    

    }
