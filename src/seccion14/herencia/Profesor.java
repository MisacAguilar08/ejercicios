package seccion14.herencia;

public class Profesor extends Persona{
    private String asignatura;

    public Profesor() {
    }

    public Profesor(String nombre,  String apellido){
        super(nombre, apellido);
    }

    public Profesor(String nombre,  String apellido, String asignatura){
        super(nombre, apellido);
        this.asignatura = asignatura;
    }

    //getters and setters
    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public String saludar(){
        String saludar = super.saludar();
        return saludar +"soy profesor, y mi nombre es: "+this.getNombre() +" e imparto la asignatura: "+this.getAsignatura();
    }

    @Override
    public String toString() {
        return super.toString() +
                "asignatura='" + asignatura + '\'';
    }
}