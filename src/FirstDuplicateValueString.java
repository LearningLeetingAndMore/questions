import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FirstDuplicateValueString {
    public static int firstDuplicateValue(String string) {
        // Write your code here.

        //2, 1, 5, 2, 3, 3, 4
        Map<Character, Integer> charMap = new HashMap<>();
        for (int i = 0; i < string.length(); i ++) {
            char charAt = string.charAt(i);
            if (charMap.containsKey(charAt)) {
                charMap.put(charAt, charMap.get(charAt) + 1);
            } else {
                charMap.put(charAt, 1);
            }
        }
        for (int i = 0; i < string.length(); i ++) {
            char charAt = string.charAt(i);
            if (charMap.get(charAt) == 1) {
                return i;
            }
        }

        return -1;
    }
}
