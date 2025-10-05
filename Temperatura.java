import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Entre com a temperatura em Fahrenheit: ");
        double Fahrenheit = teclado.nextDouble();
        double Celsius = (Fahrenheit - 32) * 5 / 9;
        System.out.println(Celsius + "º Celsius");

        teclado.close();
    }
}
