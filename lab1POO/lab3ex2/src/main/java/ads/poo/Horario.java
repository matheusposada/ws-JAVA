package ads.poo;

public class Horario {

    private int hora, minuto, segundo;

    public Horario() {
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }

    public Horario(int hora, int minuto, int segundo) {
        this.hora = (hora >= 0 && hora <= 23) ? hora : 0;
        this.minuto = (minuto >= 0 && minuto <= 59) ? minuto : 0;
        this.segundo = (segundo >= 0 && segundo <= 59) ? segundo : 0;
    }

    public boolean setHora(int hora) {
        if (hora < 0 || hora > 23) {
            return false;
        } else {
            this.hora = hora;
            return true;
        }
    }

    public boolean setMinuto(int minuto) {
        if (minuto < 0 || minuto > 59) {
            return false;
        } else {
            this.minuto = minuto;
            return true;
        }
    }

    public boolean setSegundo(int segundo) {
        if (segundo < 0 || segundo > 59) {
            return false;
        } else {
            this.segundo = segundo;
            return true;
        }
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }

    public long horarioEmSegundos() {
        return (this.hora * 3600) + (this.minuto * 60) + this.segundo;
    }

    public long diferenca(Horario h) {
        return h.horarioEmSegundos() - this.horarioEmSegundos();
    }

    private String converterParaExtenso(int valor, boolean feminino) {
        return switch (valor) {
            case 1 -> feminino ? "uma" : "um";
            case 2 -> feminino ? "duas" : "dois";
            case 3 -> "três";
            case 4 -> "quatro";
            case 5 -> "cinco";
            case 6 -> "seis";
            case 7 -> "sete";
            case 8 -> "oito";
            case 9 -> "nove";
            case 10 -> "dez";
            case 11 -> "onze";
            case 12 -> "doze";
            case 13 -> "treze";
            case 14 -> "quatorze";
            case 15 -> "quinze";
            case 16 -> "dezesseis";
            case 17 -> "dezessete";
            case 18 -> "dezoito";
            case 19 -> "dezenove";
            case 20 -> "vinte";
            case 30 -> "trinta";
            case 40 -> "quarenta";
            case 50 -> "cinquenta";
            default -> "zero";
        };
    }

    private String unidadeDezena(int valor, boolean feminino) {
        if (valor >= 20) {
            int unidade = valor % 10;
            int dezena = valor - unidade;
            String dezenaExtenso = converterParaExtenso(dezena, feminino);
            String unidadeDezena = converterParaExtenso(unidade, feminino);

            if (unidade == 0) return dezenaExtenso;
            return String.format("%s e %s", dezenaExtenso, unidadeDezena);
        }
        return converterParaExtenso(valor, feminino);
    }



    public String porExtenso() {

        String hEx = unidadeDezena(this.hora, true);
        String mEx = unidadeDezena(this.minuto, false);
        String sEx = unidadeDezena(this.segundo, false);

        String pluralHora = (this.hora == 1) ? "hora" : "horas";
        String pluralMinuto = (this.minuto == 1) ? "minuto" : "minutos";
        String pluralSegundo = (this.segundo == 1) ? "segundo" : "segundos";


        return hEx + " " + pluralHora + ", " +
                mEx + " " + pluralMinuto + ", e " +
                sEx + " " + pluralSegundo + "!";

    }


}
