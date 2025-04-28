package seccion17.generics;

import seccion17.modelo.Cliente;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploGenericos {
    public static void main(String[] args) {
       Cliente[] clienteArreglo = {new Cliente("Andres", "Guz"), new Cliente("Bea","Diaz")};
        System.out.println(clienteArreglo);
       List<Cliente> clienteLissta = fromArrayTolist(clienteArreglo);
       clienteLissta.forEach(System.out::println);
    }

    public static <T> List<T> fromArrayTolist(T[] t){
        return Arrays.asList(t);
    }

    public static <T, G> List<T> fromArrayTolist(T[] t, G[] g){
        return Arrays.asList(t);
    }

}
