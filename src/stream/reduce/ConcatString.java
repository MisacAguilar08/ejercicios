package stream.reduce;

import java.util.Arrays;
import java.util.List;

public class ConcatString {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("J","a","v","a");

        list.stream().reduce(String::concat).ifPresent(System.out::println);
    }
}
