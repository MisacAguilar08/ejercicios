package stream.map;

import java.util.Arrays;
import java.util.List;

public class Average {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,10,10,10,9);

        numbers.stream().mapToInt(x -> x).average().ifPresent(System.out::println);
    }
}
