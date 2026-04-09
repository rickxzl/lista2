public class ex02 {
    
    public static void main(String[] args) {
        
        double nota1, nota2, media;

        System.out.print("Digite a primeira nota:");
        nota1 = new java.util.Scanner(System.in).nextDouble();
        System.out.print("Digite a segunda nota:");
        nota2 = new java.util.Scanner(System.in).nextDouble();

        media = (nota1 + nota2) / 2;
        System.out.println("A média é: " + media);
        if (media >= 7) {
            System.out.println("aprovado");
        } else {
            System.out.println("reprovado");
        }
    }
}
