package seccion12.poo;

public class Automovil {
    private String fabricante;
    private String modelo;
    private String color;
    private double cilindrada;

    public Automovil(String fabricante, double cilindrada, String color, String modelo) {
        this.fabricante = fabricante;
        this.cilindrada = cilindrada;
        this.color = color;
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String isDeportivo(double cilindrada){
        return cilindrada >= 8 ?"Es deportivo/4x4":"Es comun";
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", cilindrada=" + cilindrada +
                '}';
    }
}
