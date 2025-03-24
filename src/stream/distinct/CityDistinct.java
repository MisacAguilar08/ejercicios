package stream.distinct;

import java.util.Arrays;
import java.util.List;

public class CityDistinct {
    public static void main(String[] args) {
        List<String> citys = Arrays.asList("Dallas","Los Angeles","Dallas","Ciudad de Mexico");

        citys.stream().distinct().forEach(System.out::println);
    }
}
