package stream.collect;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NameLengthAnimals {
    public static void main(String[] args) {
        List<String> animals = Arrays.asList( "Dog", "Cat", "Cow", "Sneak");
        Map<String, Integer> map = animals.stream().collect(Collectors.toMap(s->s, String::length));

        System.out.println(map);
    }
}
