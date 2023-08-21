public class Homework4o4While {
    public static void main(String[] args) {
            hundredtozero(100);
        }

        public static void hundredtozero(int x) {
            int i = 0;
            while (i < x) {
                if (x % 2 != 0) {
                    System.out.print(x + " ");
                }
                x--;
            }
        }
}
