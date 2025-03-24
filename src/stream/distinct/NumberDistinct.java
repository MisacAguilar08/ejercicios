package stream.distinct;

import java.util.Arrays;
import java.util.List;
//Dada una lista de números, imprimir los números diferentes.
public class NumberDistinct {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1,1,1,2,3,3,3,4,4,4,5);
        lista.stream().distinct().forEach(System.out::println);
    }
}
