package ads.poo;

public class Ponto {

    private int x, y;
    private double distancia;

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public double distancia(Ponto ponto) {

        distancia = Math.sqrt(Math.pow(ponto.x - this.x, 2) + Math.pow(ponto.y - this.y, 2));


        return distancia;
    }
}
