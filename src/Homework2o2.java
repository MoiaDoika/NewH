import java.util.Scanner;

public class Homework2o2 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Enter array length: ");
        int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        int array[] = new int[size]; // Создаём массив int размером в size
        /*Пройдёмся по всему массиву, заполняя его*/
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random()*10); // Заполняем массив элементами, введёнными с клавиатуры
        }
        System.out.print ("Generated numbers:");
        for (int i = 0; i < size; i++) {
            System.out.print (" " + array[i]); // Выводим на экран, полученный массив
            sum+=array[i];
        }
        System.out.println();
        System.out.println("The sum of the numbers is " + sum +".");
        System.out.println("The arithmetic mean of the numbers is " + sum/size + ".");
    }
}
