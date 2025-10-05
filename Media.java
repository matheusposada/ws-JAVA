import java.util.Scanner;

public class Media {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        double media = 0;

        System.out.print("Digite a primeira nota: ");
        double nota = teclado.nextDouble();
        media = media + nota;

        System.out.print("Digite a segunda nota: ");
        nota = teclado.nextDouble();
        media = media + nota;

        System.out.print("Digite a terceira nota: ");
        nota = teclado.nextDouble();
        media = media + nota;

        System.out.print("Digite a quarta nota: ");
        nota = teclado.nextDouble();
        media = media + nota;

        media = media / 4;

        System.out.println("A média é: " + media);

        teclado.close();
    }
}
