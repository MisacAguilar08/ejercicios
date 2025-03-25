import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

// Dividir la lista de animales en animales mayores a una longitud de 3 caracteres.
public class GreatLengthAnimal {
    public static void main(String[] args) {
        List<String> animals = Arrays.asList( "Dog", "Cat", "Cow", "Sneak");

        Map<Boolean,List<String>> map = animals.stream().collect(Collectors.partitioningBy(a -> a.length() > 3));
        System.out.println(map);
    }
}