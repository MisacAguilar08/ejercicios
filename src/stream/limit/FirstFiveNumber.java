package stream.limit;

import java.util.Arrays;
import java.util.List;

public class FirstFiveNumber {
    public static void main(String[] args) {
        List<Integer> list  = Arrays.asList(1,2,3,4,5,6,7,8,9);

        list.stream().limit(5).forEach(System.out::println);
    }
}
