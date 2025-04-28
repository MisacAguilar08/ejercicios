package seccion16;

import seccion16.modelo.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ImprentaMain {
    public static void main(String[] args) {
        Curriculum cv = new Curriculum(new Persona("John", "Doe"), "ISC", "Sistemas Computacionales");
        cv.addExperiencia("PHP");
        cv.addExperiencia("Python");
        cv.addExperiencia("Java");

        Libro lb = new Libro(new Persona("Erich", "Gamma"), "Patrones de diseño", Genero.PROGRAMACION);

        lb.addPagina(new Pagina("Holas"))
                .addPagina(new Pagina("X2"));



        Informe info = new Informe(new Persona("El", "X"), new Persona("El", "John"), "Microservicios");

        imprimir(cv);
        imprimir(info);
        imprimir(lb);
        List<Integer> listaNumeros =listaNumeros(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        
        for(Integer num: listaNumeros){
            System.out.println("num = " + num);
        }
        
    }

    public static List<Integer> listaNumeros(List<Integer> numeros){
        return numeros.stream().filter(x-> x%2 ==0).toList();
    }
    public static void imprimir(Imprimible imprimible){
        System.out.println(imprimible.imprimir());
    }
}
