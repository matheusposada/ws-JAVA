package ads.poo;


public class Main {
    static void main() {
        Horario horario = new Horario(01, 52, 61);

        IO.println(horario.toString());
        IO.println(horario.horarioEmSegundos());
        IO.println(horario.porExtenso());




    }
}

