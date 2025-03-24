package stream.max;

import java.util.Arrays;
import java.util.List;

public class Max {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);

        int max = list.stream().mapToInt(x->x).max().getAsInt();
        System.out.println(max);
    }
}
