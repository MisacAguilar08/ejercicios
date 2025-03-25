package stream.count;

import java.util.Arrays;
import java.util.List;

public class SizeList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(20,4,8,9,9,100);
        long size = numbers.stream().count();
        System.out.println("size = " + size);
    }
}
