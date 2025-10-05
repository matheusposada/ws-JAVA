import java.util.Scanner;

public class Salario {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        double salarioFixo = 2000.00;
        double salarioFinal = 0.00;

        System.out.print("Digite o valor total de vendas: ");
        double vendas = teclado.nextDouble();
        System.out.print("Digite a avaliação de desempenho de 0 a 10: ");
        double desempenho = teclado.nextDouble();

        if (vendas >= 10000.00) {
            salarioFinal = (vendas * 0.07) + salarioFixo;
        } else {
            salarioFinal = (vendas * 0.05) + salarioFixo;
        }
        if (desempenho >= 8) {
            salarioFinal = salarioFinal + 500.00;
        }

        System.out.println("O valor total da remuneração mensal é: " + salarioFinal);
        teclado.close();

    }
}
