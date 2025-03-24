package stream.sorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class OrderGreaterLess {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(10,2,8,3,7,6,5,4);

        lista.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
