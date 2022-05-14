public class E1 {
    static int factorialCounter(int x) {
        int result = 1;
        for (int i = 1; i <=x; i ++){
            result = result*i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(factorialCounter(4));
    }
}
