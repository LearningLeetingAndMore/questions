public class CheckPalindrome {
    public static boolean isPalindrome(String str) {
        // Write your code here.
        if (str == null || str.isBlank() || str.length() == 1) {
            return true;
        }

        //StringBuilder palindrome = new StringBuilder(str);
        //return palindrome.reverse().toString().equals(str);
        int i = 0, j = str.length() -1;
        while(i <= j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
