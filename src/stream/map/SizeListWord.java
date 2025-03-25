package stream.map;

import java.util.Arrays;
import java.util.List;

public class SizeListWord {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Texas", "California", "Arizona");

        list.stream().map(String::length).forEach(System.out::println);
    }
}
