public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

    public static double fatorial(double n) {
        if (n == 0)
            return 1;
        else
            return fatorial(n-1 * n);
    }
}