package stream.max;

import java.util.Arrays;
import java.util.List;

public class MaxCompareTo {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1,2,3,4,5);

        lista.stream().max(Integer::compareTo).ifPresent(System.out::println);
    }
}
