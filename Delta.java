import java.util.Scanner;

public class Delta {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o valor de a: ");
        double a = teclado.nextDouble();
        System.out.print("Digite o valor de b: ");
        double b = teclado.nextDouble();
        System.out.print("Digite o valor de c: ");
        double c = teclado.nextDouble();

        double delta = Math.pow(b, 2) - 4 * a * c;

        System.out.println("o delta é: " + delta);

        teclado.close();
    }
}
