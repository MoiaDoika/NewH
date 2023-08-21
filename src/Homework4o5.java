import java.util.Scanner;

public class Homework4o5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to calculate factorial");
        int n = input.nextInt();
        int fact = 1;
        System.out.println("Number to calculate factorial " + n + ".");
        for (int j = 1; j <=n; j++) {
            fact*=j;
        }
        System.out.println("Computed factorial " + fact + ".");
    }
}
