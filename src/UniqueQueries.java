import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UniqueQueries {
    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        // Write your code here
        List<Integer> result = new ArrayList<>();
        Map<String, Long> stringMap = strings.stream()
                .collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting()));
        for (String query : queries) {
            result.add(stringMap.getOrDefault(query, 0L).intValue());
        }
        return result;
    }
}
