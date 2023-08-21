import java.util.Scanner;

public class Homework4o5While {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to calculate factorial");
        int x = input.nextInt();
        System.out.println("Number to calculate factorial " + x + ".");
        int fact = 1;
        int i =1;
        while (i <=x) {
            fact*=i;
            i++;
            }
        System.out.println("Computed factorial " + fact + ".");
        }
    }

