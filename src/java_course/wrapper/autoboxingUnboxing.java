package java_course.wrapper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class autoboxingUnboxing {
    public static void main(String[] args) {
//        List<Integer> enteros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
       Integer[] enteros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

//        int max = enteros.stream().mapToInt(x -> x).max().getAsInt();
//        System.out.println("max = " + max);

        int suma = Arrays.stream(enteros).mapToInt(x->x).filter(x-> x%2==0).sum();
        System.out.println("suma = " + suma);
    }
}
