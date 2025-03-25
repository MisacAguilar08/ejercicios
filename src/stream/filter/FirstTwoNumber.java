package stream.filter;

import java.util.stream.IntStream;

public class FirstTwoNumber {
    public static void main(String[] args) {
        IntStream list = IntStream.rangeClosed(45,70);

        list.filter(x-> x % 2 ==0).limit(2).forEach(System.out::println);
    }
}
