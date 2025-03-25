package stream.map;

import java.util.Arrays;
import java.util.List;

public class UpperString {
    public static void main(String[] args) {
        List<String> list = Arrays.asList( "Jose", "Juan", "Carlos","Jorge");

        list.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
