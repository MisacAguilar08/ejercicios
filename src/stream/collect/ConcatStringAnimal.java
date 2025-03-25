package stream.collect;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConcatStringAnimal {
    public static void main(String[] args) {
        List<String> animals = Arrays.asList( "Dog", "Cat", "Cow", "Sneak");

//        String group = String.join(",", animals);
        String group = animals.stream().collect(Collectors.joining(","));
        System.out.println("group = " + group);

    }
}
