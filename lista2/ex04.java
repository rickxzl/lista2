import java.util.Scanner;
public class ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int anonascimento;
        int anoatual;

        System.out.println("Digite o ano de nascimento:");
        anonascimento = scanner.nextInt();
        System.out.println("Digite o ano atual:");
        anoatual = scanner.nextInt();

        if (anoatual - anonascimento >= 18) {
            System.out.println("Voce é maior de idade");
        } else {
            System.out.println("Voce é menor de idade");
        }
        
    }
}
