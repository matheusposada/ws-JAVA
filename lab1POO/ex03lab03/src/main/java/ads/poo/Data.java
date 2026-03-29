package ads.poo;

public class Data {

    private int dia;
    private int mes;
    private int ano;

    public Data() {
        this.dia = 1;
        this.mes = 1;
        this.ano = 1970;
    }

    public Data(int dia) {
        this.dia = (dia < 1 || dia > 31) ? 1 : dia;
        this.mes = (dia < 1 || dia > 31) ? 1 : mes;
        this.ano = (dia < 1 || dia > 31) ? 1970 : ano;
    }

    public Data(int dia, int mes, int ano) {

        this.ano = (ano > 0) ? ano : 1970;

        int diasNoMes = switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> (isAnoBissexto()) ? 29 : 28;
            default -> -1;
        };

        if (mes < 1 || mes > 12 || dia < 1 || dia > diasNoMes) {
            this.dia = 1;
            this.mes = 1;
            this.ano = 1970;
        } else {
            this.dia = dia;
            this.mes = mes;
        }
    }

    public boolean isAnoBissexto() {
        return (this.ano % 4 == 0 && this.ano % 100 != 0 || this.ano % 400 == 0);
    }

    public boolean setDia(int dia) {
        if (dia < 1 || dia > 31) {
            return false;
        } else {
            this.dia = dia;
            return true;
        }
    }

    public boolean setMes(int mes) {
        if (mes < 1 || mes > 12) {
            return false;
        } else {
            this.mes = mes;
            return true;
        }
    }

    public boolean setAno(int ano) {
        if (ano < 0) {
            return false;
        } else {
            this.ano = ano;
            return true;
        }
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }

    private boolean AnoBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    public int anoEmDias() {
        int total = 0;

        for (int a = 1; a < this.ano; a++) {
            total += AnoBissexto(a) ? 366 : 365;
        }

        int[] diasPorMes = {31, AnoBissexto(this.ano) ? 29 : 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int m = 0; m < this.mes - 1; m++) {
            total += diasPorMes[m];
        }

        total += this.dia;
        return total;
    }

    public int diferencaDias(Data data) {
        return Math.abs(data.anoEmDias() - this.anoEmDias());
    }

    private String converterMesParaExtenso(int valor) {
        return switch (valor) {
            case 1 -> "Janeiro";
            case 2 -> "Fevereiro";
            case 3 -> "Março";
            case 4 -> "Abril";
            case 5 -> "Maio";
            case 6 -> "Junho";
            case 7 -> "Julho";
            case 8 -> "Agosto";
            case 9 -> "Setembro";
            case 10 -> "Outubro";
            case 11 -> "Novembro";
            case 12 -> "Dezembro";
            default -> "";
        };
    }

    public String dataPorExtenso() {
        return String.format("%02d de %s de %04d", dia, converterMesParaExtenso(this.mes), ano);
    }


}
