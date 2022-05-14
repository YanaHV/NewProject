import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class E2 {

    public static Map<Integer, List<String>> groupByStringLength(final List<String> stringList) {
        final Map<Integer, List<String>> map = stringList.parallelStream()
                .collect(Collectors.groupingBy(String::length));
        return map;
    }

    public static void main(String[] args) {
        System.out.println(groupByStringLength(List.of("abc", "test", "avg", "grtt")));
    }
}
