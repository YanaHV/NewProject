public class E1 {
    static int factorialCounter(int x) {
        if (x == 1)
            return 1;
        else
            return x * factorialCounter(x - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorialCounter(4));
    }
}
