import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Homework3o3 {
    public static void main(String[] args) {
        System.out.println("Your entered data :");
        System.out.println("Deposit amount " + args[0]+ ". Percentage per annum " + args[1]+ ". Deposit duration "+ args[2]+".");
        List<Double> values = Arrays.stream(args)// массив string перебирает в массив int
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        double month = values.get(2) * 12;
        double pepe = 0;
        double impact = values.get(0)*(1 + (values.get(1)/100)/12);

        for (int i = 0; month - 1 > i ; i++) {
            System.out.println("Result of monthly capitalization " + impact);
            pepe = impact *(1 + (values.get(1)/100)/12);
            pepe -= values.get(0);
            impact = pepe + values.get(0);
        }
        System.out.println("Result at the end of the deposit " + impact);
    }
}
