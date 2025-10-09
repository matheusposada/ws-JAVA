import java.util.Scanner;

public class Calculador {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        double num1;
        double num2;
        double resultado;
        int i;

        do {            
            System.out.println("Escolha uma das operações a seguir: ");
            System.out.println("1. Soma");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("5. Sair");

            switch (i = teclado.nextInt()) {
                case 1:
                    System.out.print("Entre com o primeiro número: ");
                    num1 = teclado.nextDouble();
                    System.out.print("Entre com o segundo número: ");
                    num2 = teclado.nextDouble();
                    resultado = num1 + num2;
                    System.out.println("O resultado é: " + resultado);

                    break;

                case 2:
                    System.out.print("Entre com o primeiro número: ");
                    num1 = teclado.nextDouble();
                    System.out.print("Entre com o segundo número: ");
                    num2 = teclado.nextDouble();
                    resultado = num1 - num2;
                    System.out.println("O resultado é: " + resultado);
                    break;

                case 3:
                    System.out.print("Entre com o primeiro número: ");
                    num1 = teclado.nextDouble();
                    System.out.print("Entre com o segundo número: ");
                    num2 = teclado.nextDouble();
                    resultado = num1 * num2;
                    System.out.println("O resultado é: " + resultado);
                    break;

                case 4:
                    System.out.print("Entre com o primeiro número: ");
                    num1 = teclado.nextDouble();
                    System.out.print("Entre com o segundo número: ");
                    num2 = teclado.nextDouble();
                    if (num2 != 0) {
                        System.out.println("0"); //a divisão é possível
                    } else {
                        System.out.println("1"); //divisão por 0
                    }

                    break;

                case 5:
                    System.out.println("Operação finalizada");
                    break;

                default:
                    System.out.println("Opção inválida");
            }

        } while (i != 5);

        teclado.close();
    }
}
