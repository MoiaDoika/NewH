import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Homework1o1 {
    //нам надо найти средее арифметическое двух чисел
    public static void main(String[] args) {
        int quantity = (int) args.length;   //высчитывает количество символов массиве

        List<Integer> values = Arrays.stream(args)// массив string перебирает в массив int
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum = (sum + values.get(i));
        }
        System.out.println("The sum of the numbers is " + sum +".");//сложение всех элементов массива
        int fin = sum/quantity;
        System.out.println("The arithmetic mean of the numbers is " + fin + ".");
    }
}
