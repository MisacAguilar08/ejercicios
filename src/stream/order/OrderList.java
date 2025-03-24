package stream.order;

import java.util.Arrays;
import java.util.List;

public class OrderList {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(6,3,5,8,9,10,2,1);

        lista.stream().sorted().forEach(System.out::println);
    }
}
