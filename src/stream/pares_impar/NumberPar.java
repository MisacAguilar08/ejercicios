package stream.pares_impar;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class NumberPar {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(6,7,4,3,9,1,2);

        lista.stream().filter(x-> x%2==0).min(Comparator.naturalOrder()).ifPresent(System.out::println);
    }
}
