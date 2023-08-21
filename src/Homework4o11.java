import java.util.Arrays;

public class Homework4o11 {
    public static void main(String[] args) {
        int[] arr  = new int[] {4, -5, 0, 6, 8};

        int max = arr[0];
        int min = arr[0];
        int maxInd = 0;
        int minInd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max > arr[i]) { // сравниваем
                maxInd = i; // запоминаем индекс
                max = arr[i]; // запоминаем значение
            }
            if (min < arr[i]) { // сравниваем
                minInd = i; // запоминаем индекс
                min = arr[i]; // запоминаем значение
            }
        }
// переставляем элементы
        int temp = arr[minInd];
        arr[minInd] = arr[maxInd];
        arr[maxInd] = temp;
        Arrays.stream(arr).forEach(e-> System.out.println(e)); // вывод массива
    }
}
