import java.util.List;

public class E4 {
    public static long findAmountOfEmptyStrings(final List<String> stringList) {
      return stringList.stream()
                .filter(String::isEmpty)
                .count();
    }

    public static void main(String[] args) {
        System.out.println(findAmountOfEmptyStrings(List.of("abc", "", "", "avg")));
    }
}
