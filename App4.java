import java.util.Scanner;

public class App4 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        double[] notas = new double[39]; // coloquei 39 para poder usar os espaços de 1 a 38
        double media = 0;

        System.out.println("Digite as notas dos alunos: ");

        for (int i = 1; i <= 38; i++) { // 1 a 38 para não imprimir o primeiro aluno como "aluno 0"
            System.out.println("Aluno " + i + ":");
            notas[i] = teclado.nextDouble();
        }

        for (int i = 1; i <= 38; i++) {
            media = media + notas[i];
        }

        media = media / 38;

        System.out.println("A média das notas é: ");
        System.out.println(String.format("%.2f", media));

        double maior = notas[1];
        for (int i = 1; i <= 38; i++) {
            if (notas[i] > maior) {
                maior = notas[i];
            }
        }

        System.out.println("A maior nota é: " + maior);

        double menor = notas[1];
        for (int i = 1; i <= 38; i++) {
            if (notas[i] < menor) {
                menor = notas[i];
            }
        }

        System.out.println("A menor nota é: " + menor);

        teclado.close();
    }
}
