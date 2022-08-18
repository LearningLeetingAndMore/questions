import java.util.HashSet;
import java.util.Set;

public class FirstDuplicateValue {
    public static int firstDuplicateValue(int[] array) {
        // Write your code here.

        //2, 1, 5, 2, 3, 3, 4
        Set<Integer> duplicate = new HashSet<>();
        for (int j : array) {
            if (duplicate.contains(j)) {
                return j;
            } else {
                duplicate.add(j);
            }
        }

        return -1;
    }
}
