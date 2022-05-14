import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class E5 {
    public static List<Integer> findSquareAndDistinct(final List<Integer> numbers) {
        return numbers.stream()
                .map(i -> i * i)
                .distinct()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(findSquareAndDistinct(List.of(9, 10, 3, 4, 7, 3, 4)));
    }
}
