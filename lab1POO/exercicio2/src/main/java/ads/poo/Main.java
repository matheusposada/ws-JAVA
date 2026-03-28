package ads.poo;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static void main() {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        int numeroAleatorio = rand.nextInt(100) + 1;
        int contador = 0;
        int i;

        do{
            IO.println("Adivinhe o número de 1 a 100: ");
            i = input.nextInt();
            contador++;
            if (i < numeroAleatorio){
                IO.println("Seu chute é menor que o número. Tente novamente.!");
            } else  if (i > numeroAleatorio){
                IO.println("Seu chute é maior que o número. Tente novamente.!");
            }
        }
        while(i != numeroAleatorio);

            IO.println("Parabéns, voce acertou em " + contador + " tentativas!");
    }
}

