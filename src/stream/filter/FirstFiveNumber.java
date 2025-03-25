package stream.filter;

import java.util.stream.IntStream;

public class FirstFiveNumber {
    public static void main(String[] args) {
        IntStream list = IntStream.rangeClosed(35,50);
        list.filter(x-> x%2 != 0).limit(5).forEach(System.out::println);
    }
}
