import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Homework4o10 {
    public static void main(String[] args) {
        int array[] = new int[101];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*101);
        }
        System.out.println(array[3]);
        List<Integer> ints = Arrays.stream(array)
                .boxed()
                .collect(Collectors.toList());

        System.out.println("Min element is " + Collections.min(ints));
        System.out.println("Min element is " + Collections.max(ints));
    }
}
