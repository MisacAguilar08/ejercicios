package stream.map;

import java.util.Arrays;
import java.util.List;

public class Sum {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,10,10,10,9);

        int sum = numbers.stream().mapToInt(x -> x).sum();
        System.out.println(sum);
    }
}
