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
}
