package seccion14.herencia;

public class Alumno extends Persona {

    private String institucion;
    private double notaIngles;
    private double notaHistoria;

    public Alumno(){
        super();
    }

    public Alumno(String nombre, String apellido){
        super(nombre, apellido);
    }

    public Alumno(String nombre, String apellido, int edad){
        super(nombre, apellido, edad);
    }

    public Alumno(String nombre, String apellido, int edad, String institucion){
        super(nombre, apellido, edad);
        this.institucion = institucion;
    }

    public Alumno(String nombre, String apellido, int edad, String institucion, double notaIngles, double notaHistoria){
        this(nombre, apellido, edad, institucion);
        this.notaIngles = notaIngles;
        this.notaHistoria = notaHistoria;
    }
    
    // Getters and Setters
    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }


    public double getNotaIngles() {
        return notaIngles;
    }

    public void setNotaIngles(double notaIngles) {
        this.notaIngles = notaIngles;
    }

    public double getNotaHistoria() {
        return notaHistoria;
    }

    public void setNotaHistoria(double notaHistoria) {
        this.notaHistoria = notaHistoria;
    }

    @Override
    public String saludar(){
        String saludar = super.saludar();
        return saludar+ "soy alumno, y mi nombre es: "+this.getNombre();
    }

    public double calucularPromedio(){
        System.out.println(this.getClass().getCanonicalName());
        return (notaHistoria + notaIngles)/2;
    }

    @Override
    public String toString() {
        return super.toString() +
                "institucion='" + institucion + '\'' +
                ", notaIngles=" + notaIngles +
                ", notaHistoria=" + notaHistoria+
                "calcular promedio: "+this.calucularPromedio();
    }
}