public class Homework4o4DoWhile {
    public static void main(String[] args) {
        hundredtozero(100);
    }

    public static void hundredtozero(int x) {
        int i = 0;
        do{
            if (x % 2 != 0) {
                System.out.print(x + " ");
            }
            x--;
        } while (i < x);
    }
}
