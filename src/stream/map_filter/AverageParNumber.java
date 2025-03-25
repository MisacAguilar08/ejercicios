package stream.map_filter;

import java.util.stream.IntStream;

public class AverageParNumber {
    public static void main(String[] args) {
        IntStream list = IntStream.rangeClosed(1,10);

        list.map(x -> x*x).filter(x-> x%2 ==0).average().ifPresent(System.out::println);
    }
}
