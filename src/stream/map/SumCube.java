package stream.map;

import java.util.stream.IntStream;

public class SumCube {
    public static void main(String[] args) {
        IntStream list = IntStream.rangeClosed(1,5);
//        double sum = list.mapToDouble(x-> Math.pow(x,3)).sum();
        int sum = list.map(x-> x*x*x).sum();
        System.out.println(sum);
    }
}
