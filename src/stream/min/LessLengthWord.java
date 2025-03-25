package stream.min;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LessLengthWord {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Texas", "California", "Arizona");

        list.stream().min(Comparator.comparingInt(String::length)).ifPresent(System.out::println);
    }
}
