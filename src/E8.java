import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class E8 {
    public static void main(String[] args) {
        System.out.println(convertListToLinkedHashMap(List.of("Bluehost", "GoDaddy", "Amazon AWS", "LiquidWeb", "FatCow")));
    }

    public static Map<String, Integer> convertListToLinkedHashMap(final List<String> strings) {
        return strings.stream()
                .collect(Collectors.toMap(Function.identity(),String::length, LinkedHashMap::new));
    }
}
