import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class ValidateSequence {
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        // Write your code here.
        if (sequence.size() > array.size()) {
            return false;
        }

        int j = 0;
        for (Integer arrayElement : array) {
            if (j < sequence.size() && Objects.equals(arrayElement, sequence.get(j))) {
              j++;
            }
        }
        return j == sequence.size();
    }
}
