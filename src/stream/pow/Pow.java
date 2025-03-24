package stream.pow;

import java.util.Arrays;
import java.util.List;

public class Pow {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1,2,3,4,5);

        lista.stream().map( x -> x*x).forEach(System.out::println);
    }
}
