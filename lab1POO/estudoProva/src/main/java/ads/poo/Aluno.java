package ads.poo;

public class Aluno {

    private String nome;
    private int matricula;
    private double nota;

    public Aluno(String nome, int matricula, double nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = (nota < 0 || nota > 10) ? 0.0 : nota;
    }

    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = 0;
    }


    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public double getNota() {
        return nota;
    }

    public boolean setNota(double nota) {
        if (nota < 0 || nota > 10) {
            return false;
        } else {
            this.nota = nota;
            return true;
        }
    }

    public String situacao() {
        return (nota >=6) ? "Aprovado" : "Reprovado";
    }
}
