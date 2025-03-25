package stream.filter;

import java.util.stream.IntStream;

public class TotalImparList {
    public static void main(String[] args) {
        IntStream list = IntStream.rangeClosed(1, 50);

        long total = list.filter(x-> x%2 !=0).count();
        System.out.println(total);
    }
}
