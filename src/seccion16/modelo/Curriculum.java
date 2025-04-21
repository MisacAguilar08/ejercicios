package seccion16.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curriculum extends Hoja{

    private String persona;
    private String carrera;
    private List<String> experiencias;


    public Curriculum(String persona, String carrera, String contenido) {
        super(contenido);
        this.persona = persona;
        this.carrera = carrera;
        this.experiencias = new ArrayList<String>();
    }

    public Curriculum addExperiencia(String exp){
        experiencias.add(exp);
        return this;
    }

    @Override
    public String imprimir() {
        StringBuilder sb= new StringBuilder("Nombre: ");
        sb.append(persona).append("\n")
                .append("Resumen: ").append(this.contenido)
                .append("\n").append("profesion: ")
                .append(this.carrera). append("\n")
                .append("Experiecnia: \n");

        this.experiencias.forEach(exp -> sb.append("- ").append(exp).append("\n"));


        return sb.toString();
    }
}
