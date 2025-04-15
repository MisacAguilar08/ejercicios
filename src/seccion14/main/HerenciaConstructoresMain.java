package seccion14.main;

import seccion14.herencia.Alumno;
import seccion14.herencia.AlumnoExtranjero;
import seccion14.herencia.Persona;
import seccion14.herencia.Profesor;

public class HerenciaConstructoresMain {
    public static void main(String[] args) {
        // Entry point for the application
        Alumno alumno = new Alumno("Juan", "Daley", 41, "Instituto Nacional");
        alumno.setEmail("juan@example.com");
        alumno.setNotaIngles(8.5);
        alumno.setNotaHistoria(9.0);
        System.out.println("Institución: " + alumno.getInstitucion() + ", Nota Inglés: " + alumno.getNotaIngles() + ", Nota Historia: " + alumno.getNotaHistoria());

        AlumnoExtranjero alumnoExtranjero = new AlumnoExtranjero("Peter", "Parker", "Australia");
        alumnoExtranjero.setNotaIdiomas(9.9);
        alumnoExtranjero.setEmail("peter@example.com");
        alumnoExtranjero.setInstitucion("Instituto Nacional");
        alumnoExtranjero.setNotaIngles(9.5);
        alumnoExtranjero.setNotaHistoria(9.5);
        System.out.println("Alumno Extranjero: " + alumnoExtranjero.getNombre() 
        + ", Email: " + alumnoExtranjero.getEmail() + ", País: " + alumnoExtranjero.getPais() 
        + ", Institución: " + alumnoExtranjero.getInstitucion() + ", Nota Inglés: " 
        + alumnoExtranjero.getNotaIngles() + ", Nota Historia: " + alumnoExtranjero.getNotaHistoria() + ", Nota Idiomas: " + alumnoExtranjero.getNotaIdiomas());

        Profesor profesor = new Profesor("Carlos", "Navarrete", "Historia");
        profesor.setEdad(38);
        System.out.println("Profesor: " + profesor.getNombre() + ", Email: " + profesor.getEmail());

        imprimir(alumno);
        imprimir(alumnoExtranjero);
        imprimir(profesor);
    }

    public static void imprimir(Persona persona){
        System.out.println("Datos comunes");
        System.out.println("Nombre: " + persona.getNombre()+" , apellido: "+ persona.getApellido()+" ,edad: "+persona.getEdad());
        System.out.println(persona.saludar());
        if(persona instanceof Alumno){
            System.out.println("Datos alumno");
            System.out.println("Institucion: "+ ((Alumno) persona).getInstitucion());
            System.out.println("Institucion: "+ ((Alumno) persona).getNotaHistoria());
            System.out.println("Institucion: "+ ((Alumno) persona).getNotaIngles());

            if(persona instanceof AlumnoExtranjero){
                System.out.println("Datos alumno extranjero");
                System.out.println("Pais: "+ ((AlumnoExtranjero) persona).getPais());
                System.out.println("Nota idiomas: "+ ((AlumnoExtranjero) persona).getNotaIdiomas());
            }

            System.out.println("Promedio: "+((Alumno) persona).calucularPromedio());
        } else if (persona instanceof  Profesor) {
            System.out.println("Datos profesor");
            System.out.println("Asignatura: "+ ((Profesor) persona).getAsignatura());
        }
    }
}