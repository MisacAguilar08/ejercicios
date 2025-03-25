import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupLengthAnimal {
    public static void main(String[] args) {
        List<String> animals = Arrays.asList( "Dog", "Cat", "Cow", "Sneak");

        Map<Integer, List<String>> map =animals.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(map);
    }
}
