package stream.min;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Min {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(5,2,3,4,1);

        lista.stream().min(Comparator.naturalOrder()).ifPresent(System.out::println);
    }
}
