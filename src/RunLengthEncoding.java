public class RunLengthEncoding {
    public static String runLengthEncoding(String string) {
        // Write your code here.
        StringBuilder result = new StringBuilder();
        int i=0, j, counter = 1;

        for (j=1;j< string.length(); j++) {
            if (string.charAt(j -1) == string.charAt(j)) {
                counter++;
                if (counter > 9) {
                    result.append(9).append(string.charAt(j));
                    counter -= 9;
                }
            } else {
                result.append(counter).append(string.charAt(j-1));
                counter = 1;
            }
        }


        return result.append(counter).append(string.charAt(string.length() -1)).toString();
    }
}
