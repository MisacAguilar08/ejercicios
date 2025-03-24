package stream.min;

import stream.Objects.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Imprimir nombre, edad y sexo de la persona de menor edad.
public class PersonLess {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person("Charly", 32, 'M'), new Person("Gorge", 42, 'M'), new Person("Jenny", 25, 'F'));

        Comparator<Person> comparator = (p1, p2) -> p1.getAge() - p2.getAge();

        people.stream().min(comparator).ifPresent(System.out::println);

        System.out.println("min -> Comparator.comparing");

        people.stream().min(Comparator.comparing(Person::getAge)).ifPresent(System.out::println);
    }
}
