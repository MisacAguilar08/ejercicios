package seccion14.main;

import seccion14.herencia.Alumno;
import seccion14.herencia.AlumnoExtranjero;
import seccion14.herencia.Persona;
import seccion14.herencia.Profesor;

public class HerenciaToStringMain {
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
        System.out.println(persona);
    }
}