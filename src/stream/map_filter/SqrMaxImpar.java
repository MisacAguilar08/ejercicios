package stream.map_filter;

import java.util.stream.IntStream;

public class SqrMaxImpar {
    public static void main(String[] args) {
        IntStream list = IntStream.rangeClosed(5,15);

        list.map(x -> x * x).filter(x-> x%2 != 0).max().ifPresent(System.out::println);
    }
}
