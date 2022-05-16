import java.util.List;

public class E3 {
    public static double calculateAverage(List<Long> longList) {
        return longList.stream()
                .mapToLong(a -> a)
                .average()
                .orElseThrow();
    }

    public static void main(String[] args) {
        System.out.println(calculateAverage(List.of(1L, 2L, 3L, 4L)));
    }
}

