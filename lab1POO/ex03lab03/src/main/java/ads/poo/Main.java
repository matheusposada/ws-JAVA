package ads.poo;


public class Main {
    static void main() {

        Data d =  new Data(31, 02, 1998);
        Data d1 = new Data(29, 3, 2026);

        IO.println(d.toString());
        IO.println(d1.toString());
        IO.println(d.anoEmDias());
        IO.println(d1.anoEmDias());
        IO.println(d1.diferencaDias(d));
        IO.println(d.dataPorExtenso());



    }
}

