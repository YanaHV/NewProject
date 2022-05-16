import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class E6 {
    public static void main(String[] args) {
        final var primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        IntSummaryStatistics st = primes.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();

        System.out.println("Highest prime number in List : " + st.getMax());
        System.out.println("Lowest prime number in List : " + st.getMin());
        System.out.println("Sum of all prime numbers : " + st.getSum());
        System.out.println("Average of all prime numbers : " + st.getAverage());
    }
}