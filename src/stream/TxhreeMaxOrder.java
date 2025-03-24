package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TxhreeMaxOrder {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1,2,3,4,5);

        lista.stream().max(Comparator.naturalOrder()).ifPresent(System.out::println);
    }
}
