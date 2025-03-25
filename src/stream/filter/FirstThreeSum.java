package stream.filter;

import java.util.stream.IntStream;

public class FirstThreeSum {
    public static void main(String[] args) {
        IntStream list = IntStream.rangeClosed(45,70);

        long sum = list.filter(x-> x%2==0).limit(3).sum();
        System.out.println(sum);
    }
}
