package stream.sorted;

import stream.Objects.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
//Imprimir la lista de personas ordenada por nombre (A - Z).
public class OrderPerson {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList( new Person("Charly",32,'M'), new Person("Gorge",42,'M'), new Person("Jenny",25,'F'));

        Comparator<Person> comparator = (p1,p2) -> p1.getName().compareTo(p2.getName());
        people.stream().sorted(comparator).forEach(System.out::println);
        System.out.println("sorted -> Comparator.comparing");
        people.stream().sorted(Comparator.comparing(Person::getName)).forEach(System.out::println);
    }
}
