import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MinMaxSum {
    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        if (arr == null || arr.isEmpty()) {
            System.out.println("0 0");
        } else {
            BigDecimal maxSum = new BigDecimal(0);
            BigDecimal minSum = new BigDecimal(0);
            List<Integer> sortedList = arr.stream().sorted().collect(Collectors.toList());
            Map<String, String> phoneBook = new HashMap<>();
            for (int i = 0; i < sortedList.size(); i++) {
                if (i > 0) {
                    maxSum = maxSum.add(new BigDecimal(sortedList.get(i)));
                }

                if (i < 4) {
                    minSum = minSum.add(new BigDecimal(sortedList.get(i)));
                }
            }

            System.out.println(maxSum.toPlainString() + " " + minSum.toPlainString());
        }
    }
}
