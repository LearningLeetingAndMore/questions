import java.util.List;
import java.util.stream.Collectors;

public class FindMedian {
    public static int findMedian(List<Integer> arr) {
        // Write your code here
        List<Integer> sortedList = arr.stream().sorted().collect(Collectors.toList());
        return 0;
    }
}
