public class Homework4o6 {
    public static void main(String[] args) {
        Sum(4,5);

    }
    public static void Sum(int x, int n){
        int cup = n / 2;
        if (n % 2 == 0)
            System.out.println("Solution "+(cup*cup));
        else
            System.out.println("Solution "+(x*cup*cup));
    }

    }
