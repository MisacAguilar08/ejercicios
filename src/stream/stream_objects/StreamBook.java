package stream.stream_objects;

import stream.Objects.Book;

import java.util.Collection;
import java.util.List;

public class StreamBook {
    public static void main(String[] args) {
        List<Book> list = List.of(
            new Book("Java Procesamiento de datos", "Programming", List.of("Carlos"), "2022"),
            new Book("OCP Oracle Certified", "programming",List.of("Jeanne","Boyarsky", "Scott Selikoff"), "2016"),
            new Book("Hiroshima", "reporting", List.of("John Hersey"), "2016")
        );

        System.out.println("Listas los autores de todos los libros.");
//        list.stream().map(Book::getAuthorNames).flatMap(x -> x.stream()).forEach(System.out::println);
        list.stream().map(Book::getAuthorNames).flatMap(Collection::stream).forEach(System.out::println);

        System.out.println("Listas los nombres de los autores que inician con la letra J.");
        list.stream().map(Book::getAuthorNames).flatMap(Collection::stream).filter(book -> book.startsWith("J")).forEach(System.out::println);


    }
}
