package stream.map;

import stream.Objects.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
// Imprimir la edad mayor para lista de personas.
public class MaxPerson {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList( new Person("Charly",32,'M'), new Person("Gorge",42,'M'), new Person("Jenny",25,'F'));

        people.stream().map(Person::getAge).max(Comparator.naturalOrder()).ifPresent(System.out::println);

    }
}
