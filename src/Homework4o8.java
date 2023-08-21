import java.util.Scanner;
public class Homework4o8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to multiply");
        int x = input.nextInt();
        for (int i = 0; i <= 10 ; i++) {
            System.out.println(x + " * " + i + " = " + x * i);

        }
    }
}
