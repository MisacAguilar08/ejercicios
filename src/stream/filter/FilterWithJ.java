package stream.filter;

import java.util.Arrays;
import java.util.List;

public class FilterWithJ {
    public static void main(String[] args) {
        List<String> list = Arrays.asList( "Jose", "Juan", "Carlos","Jorge");

        list.stream().filter(x -> x.startsWith("J")).forEach(System.out::println);
    }
}
