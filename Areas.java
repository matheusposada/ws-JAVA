import java.util.Scanner;

public class Areas {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escolha uma opção abaixo para ser executada");
        System.out.println("1. Área de um retângulo");
        System.out.println("2. Área de um triângulo");
        System.out.println("3. Hipotenusa de um triângulo retângulo");
        System.out.println("4. Área de um círculo");
        System.out.println("5. Perímetro de um círculo");
        System.out.println("6. Média de 3 números de ponto flutuante");        
        
        int numero = teclado.nextInt();
        double pi = 3.14159;

        switch (numero) {
            case 1:
                System.out.print("Entre com a altura do retângulo: ");
                double altRetangulo = teclado.nextDouble();
                System.out.print("Entre com a largura do retângulo: ");
                double largRetangulo = teclado.nextDouble();
                if (largRetangulo >= 1 && altRetangulo >= 1) {
                    double areaRetangulo = altRetangulo * largRetangulo;
                    System.out.printf("A área do retângulo é: %.2f \n", areaRetangulo);
                } else {
                    System.out.println("Número inválido");
                }
                break;
            case 2:
                System.out.print("Entre com a base do triângulo: ");
                double baseTriangulo = teclado.nextDouble();
                System.out.print("Entre com a altura de um triângulo: ");
                double altTriangulo = teclado.nextDouble();
                if (baseTriangulo >= 1 && altTriangulo >= 1) {
                    double areaTriangulo = (baseTriangulo * altTriangulo) / 2;
                    System.out.printf("A área do triângulo é: %.2f \n", areaTriangulo);
                } else {
                    System.out.println("Número inválido");
                }
                break;
            case 3:
                System.out.print("Entre com o cateto a: ");
                double catetoA = teclado.nextDouble();
                System.out.print("Entre com o cateto b: ");
                double catetoB = teclado.nextDouble();
                if (catetoA >= 1 && catetoB >= 1) {
                    catetoA = Math.pow(catetoA, 2); // número elevado a 2
                    catetoB = Math.pow(catetoB, 2);
                    double hipotenusa = Math.sqrt(catetoA + catetoB); // raíz quadrada
                    System.out.printf("A hipotenusa é: %.2f \n", hipotenusa);
                } else {
                    System.out.println("número inválido");
                }
                break;
            case 4:
                System.out.print("Entre com o raio do círculo: ");
                double raio = teclado.nextDouble();
                if (raio >= 1) {
                    double areaCirculo = pi * Math.pow(raio, 2);
                    System.out.printf("A área do círculo é: %.2f \n ", areaCirculo);
                } else {
                    System.out.println("Número inválido");
                }
                break;
            case 5:
                System.out.print("Entre com o raio do círculo: ");
                double raio2 = teclado.nextDouble();
                if (raio2 >= 1) {
                    double perimetro = 2 * pi * raio2;
                    System.out.printf("O perímetro do círculo é: %.2f \n ", perimetro);
                } else {
                    System.out.println("número inválido");
                }

                break;
            case 6:
                System.out.print("Entre com o primeiro número: ");
                double num1 = teclado.nextDouble();
                System.out.print("Entre com o segundo número: ");
                double num2 = teclado.nextDouble();
                System.out.print("Entre com o terceiro número: ");
                double num3 = teclado.nextDouble();
                double media = (num1 + num2 + num3) / 3;
                System.out.printf("A média é: %.2f \n", media);
                break;
            default:
                System.out.println("Opção inválida");

        }

        teclado.close();
    }
}