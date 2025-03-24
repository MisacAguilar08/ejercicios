package stream.filter;

import stream.Objects.Person;

import java.util.Arrays;
import java.util.List;
//Imprimir las personas de sexo masculino (sex = M).

public class FilterTypeSex {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList( new Person("Charly",32,'M'), new Person("Gorge",42,'M'), new Person("Jenny",25,'F'));

        people.stream().filter(p -> p.getSex() == 'M').forEach(System.out::println);
    }
}
