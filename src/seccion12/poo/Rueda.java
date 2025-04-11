package seccion12.poo;

public class Rueda {
    private String fabricante;
    private int rin;
    private double pulgadas;

    public Rueda(String fabricante, int rin, double pulgadas) {
        this.fabricante = fabricante;
        this.rin = rin;
        this.pulgadas = pulgadas;
    }

    public String getFabricante() {
        return fabricante;
    }

    public int getRin() {
        return rin;
    }

    public double getPulgadas() {
        return pulgadas;
    }
}
