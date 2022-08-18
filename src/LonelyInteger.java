import java.util.Collections;
import java.util.List;

public class LonelyInteger {
    public static int lonelyinteger(List<Integer> a) {
        // Write your code here
        int uniqueNumber = 0;
        for (Integer integer : a) {
            uniqueNumber = uniqueNumber ^ integer;
        }
        return uniqueNumber;
    }
}
