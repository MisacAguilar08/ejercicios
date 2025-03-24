package stream.filter;

import java.util.Arrays;
import java.util.List;

public class GreaterLess {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        lista.stream().filter(x-> x > 5 && x < 10).forEach(System.out::println);
    }
}
