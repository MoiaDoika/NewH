public class Homework4o9 {
    public static void main(String[] args) {
        int array[] = new int[10];
        for (int i = 0; i < 21; i++) {
            if (i % 2 != 0) {
                for (int j = 0; j < 1; j++) {
                    array[j] = i;
                    System.out.print(array[j]+ ", ");
                }
            }
        }
    }
}
