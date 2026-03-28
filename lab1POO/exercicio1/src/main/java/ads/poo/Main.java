package ads.poo;


import java.util.Scanner;

public class Main {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        IO.println("Entre com o dia: ");
        int dia = teclado.nextInt();

        IO.println("Entre com o mês: ");
        String mes = teclado.next();

        if ((dia >= 21 && mes.equalsIgnoreCase("Dezembro")) || mes.equalsIgnoreCase("Janeiro") || mes.equalsIgnoreCase("Fevereiro") || (dia < 21 && mes.equalsIgnoreCase("Março"))) {
            IO.println("Verão");
        } else if ((dia >= 21 && mes.equalsIgnoreCase("Março")) || mes.equalsIgnoreCase("Abril") || mes.equalsIgnoreCase("Maio") || (dia < 21 && mes.equalsIgnoreCase("Junho"))) {
            IO.println("Outono");
        } else if ((dia >= 21 && mes.equalsIgnoreCase("Junho")) || mes.equalsIgnoreCase("Julho") || mes.equalsIgnoreCase("Agosto") || (dia < 21 && mes.equalsIgnoreCase("Setembro"))) {
            IO.println("Inverno");
        } else if ((dia >= 21 && mes.equalsIgnoreCase("Setembro")) || mes.equalsIgnoreCase("Outubro") || mes.equalsIgnoreCase("Novembro") || (dia < 21 && mes.equalsIgnoreCase("Dezembro"))) {
            IO.println("Primavera");
        }


        teclado.close();
    }
}

