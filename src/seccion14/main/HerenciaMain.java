package seccion14.main;

import seccion14.herencia.*;

public class HerenciaMain {
    public static void main(String[] args) {
        // Entry point for the application
        Alumno alumno = new Alumno();
        alumno.setNombre("Juan");
        alumno.setEmail("juan@example.com");
        alumno.setInstitucion("Instituto Nacional");
        alumno.setNotaIngles(8.5);
        alumno.setNotaHistoria(9.0);
        System.out.println("Institución: " + alumno.getInstitucion() + ", Nota Inglés: " + alumno.getNotaIngles() + ", Nota Historia: " + alumno.getNotaHistoria());

        AlumnoExtranjero alumnoExtranjero = new AlumnoExtranjero();
        alumnoExtranjero.setPais("Australia");
        alumnoExtranjero.setNotaIdiomas(9.9);
        alumnoExtranjero.setNombre("Peter");
        alumnoExtranjero.setEmail("peter@example.com");
        alumnoExtranjero.setInstitucion("Instituto Nacional");
        alumnoExtranjero.setNotaIngles(9.5);
        alumnoExtranjero.setNotaHistoria(9.5);
        System.out.println("Alumno Extranjero: " + alumnoExtranjero.getNombre() 
        + ", Email: " + alumnoExtranjero.getEmail() + ", País: " + alumnoExtranjero.getPais() 
        + ", Institución: " + alumnoExtranjero.getInstitucion() + ", Nota Inglés: " 
        + alumnoExtranjero.getNotaIngles() + ", Nota Historia: " + alumnoExtranjero.getNotaHistoria() + ", Nota Idiomas: " + alumnoExtranjero.getNotaIdiomas());

        Profesor profesor = new Profesor();
        profesor.setNombre("Carlos");
        profesor.setEmail("carlos@example.com");
        System.out.println("Profesor: " + profesor.getNombre() + ", Email: " + profesor.getEmail());
    }
}