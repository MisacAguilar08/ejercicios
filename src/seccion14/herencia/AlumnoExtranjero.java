package seccion14.herencia;

public class AlumnoExtranjero extends Alumno{
    private String pais;
    private double notaIdiomas;

    public AlumnoExtranjero() {
    }

    public AlumnoExtranjero(String nombre, String apellido){
        super(nombre, apellido);
    }

    public AlumnoExtranjero(String nombre, String apellido, String pais){
        super(nombre, apellido);
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getNotaIdiomas() {
        return notaIdiomas;
    }

    public void setNotaIdiomas(double notaIdiomas) {
        this.notaIdiomas = notaIdiomas;
    }

    @Override
    public String saludar(){
        String saludar = super.saludar();
        return saludar + ", soy extranjero y vengo de "+ this.getPais();
    }

    @Override
    public double calucularPromedio() {
        return ((super.calucularPromedio()* 2) + notaIdiomas) / 3;
    }

    @Override
    public String toString() {
        return super.toString() +
                "pais='" + pais + '\'' +
                ", notaIdiomas=" + notaIdiomas;
    }
}
