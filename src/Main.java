public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

    public static double potencia (double base, int potencia ){
        if (potencia == 0) return 1;
        return base * potencia(base, potencia -1);
    }

    public static double fatorial(double n) {
        if (n == 0)
            return 1;
        else
            return fatorial(n-1 * n);
    }

    public static double binomioNewton  (int n, int x) {
        return fatorial(n) / (fatorial(n-x) * fatorial(x));
    }
}