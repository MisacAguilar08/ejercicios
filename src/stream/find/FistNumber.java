package stream.find;

import java.util.Arrays;
import java.util.List;
//Imprimir el primer número de la lista.
public class FistNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

       numbers.stream().findFirst().ifPresent(System.out::println);

       numbers.stream().findAny().ifPresent(System.out::println);
    }
}
