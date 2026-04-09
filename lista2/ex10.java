import java.util.Scanner;

public class ex10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String admin = "admin";
        int senha = 1234;

        System.out.println("Digite o nome de usuario:");
        String usuario = scanner.nextLine();
        System.out.println("Digite a senha:");
        int senhaDigitada = scanner.nextInt();

        if (usuario.equals(admin) && senhaDigitada == senha) {
            System.out.println("Acesso permitido");
        } else {
            System.out.println("Acesso negado");
        }
    }
}