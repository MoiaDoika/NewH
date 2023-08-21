import java.util.Scanner;

public class Homework4o5DoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to calculate factorial");
        int x = input.nextInt();
        System.out.println("Number to calculate factorial " + x + ".");
        int fact = 1;
        int i =1;
        do{
            fact*=i;
            i++;
        }while (i <=x);
        System.out.println("Computed factorial " + fact + ".");
    }
}
