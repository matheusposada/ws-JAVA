import java.util.Scanner;

public class Aposentadoria {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a idade: ");
        int idade = teclado.nextInt();
        System.out.print("Digite o tempo de trabalho: ");
        int tempo = teclado.nextInt();

        if (idade >= 65 || tempo >= 30) {
            System.out.println("Pode se aposentar");
        } else if (idade >= 60 && tempo >= 25) {
            System.out.println("Pode se aposentar");
        } else {
            System.out.println("Trabalhe mais um pouco!");
        }

        teclado.close();
    }
}
