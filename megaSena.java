import java.util.Arrays;
import java.util.Random;

public class megaSena {
    public static void main(String[] args) throws Exception {
        Random random = new Random();

        int i = 0;
        int[] jogo = new int[6];

        while (i < 6) {
            int numero = random.nextInt(60) + 1;
            boolean repetido = false;

            for (int j = 0; j < i; j++) {
                if (jogo[j] == numero) {
                    repetido = true;
                    break;
                }
            }

            if (!repetido) {
                jogo[i] = numero;
                i++;
            }

        }

        Arrays.sort(jogo);

        // Impressão
        System.out.println("\nNúmeros da Mega da Virada:");
        for (int num : jogo) {
            System.out.print(num + " ");
        }

    }
}
