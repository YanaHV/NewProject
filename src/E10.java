import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class E10 {
    public static void main(String[] args) {
        System.out.println(convertListToTreeMapWithException(List.of("Bluehost", "GoDaddy", "Bluehost")));
    }

    public static Map<String, Integer> convertListToTreeMapWithException(final List<String> strings) throws IllegalArgumentException {
        return strings.stream()
                .collect(Collectors.toMap(Function.identity(),
                        String::length,
                        (a, b) -> {
                            throw new IllegalArgumentException("Помилка!");
                        },
                        TreeMap::new));
    }
}
