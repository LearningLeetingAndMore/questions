import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BalancedBrackets {
    public static String isBalanced(String s) {
        // Write your code here
        if (s == null || s.isEmpty() || s.length() % 2 != 0) {
            return "NO";
        }

        if (s.charAt(0) == ')' || s.charAt(0) == ']' || s.charAt(0) == '}') {
            return "NO";
        }

        if (s.charAt(s.length() -1) == '[' || s.charAt(s.length() -1) == '{' || s.charAt(s.length() -1) == ')') {
            return "NO";
        }

        Map<String, String> bracketPair = new HashMap<>();
        bracketPair.put("}", "{");
        bracketPair.put("]", "[");
        bracketPair.put(")", "(");

        char[] ch = s.toCharArray();
        Stack<String> openingBrackets = new Stack<>();
        for (char c : ch) {
            if (c == '{' || c == '[' || c == '(') {
                openingBrackets.push(String.valueOf(c));
            }

            if (c == ')' || c == ']' || c == '}') {
                if (openingBrackets.isEmpty() || !bracketPair.get(String.valueOf(c)).equals(openingBrackets.pop())) {
                    return "NO";
                }
            }

        }
        return "YES";
    }
}
