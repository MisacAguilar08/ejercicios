package stream.map_filter;

import java.util.stream.IntStream;
//Imprimir el valor mínimo cuadrado par de la lista de números entre 5 y 15. (incluir 5 y 15)
public class SqrMinPar {
    public static void main(String[] args) {

        IntStream numbers = IntStream.rangeClosed(5,15);// Genera una lista del 5 al 15
        numbers.forEach(System.out::println);
    }
}
