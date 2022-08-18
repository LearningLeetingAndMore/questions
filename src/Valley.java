public class Valley {
    public static int countingValleys(int steps, String path) {
        // Write your code here
        if (path == null || path.isEmpty()) {
            return 0;
        }

        if (path.length() % 2 != 0 || steps != path.length()) {
            return 0;
        }

        char[] ch = path.toCharArray();

        int noOfValleys = 0;
        int count = 0;
        // Printing array
        for (int i = 0; i < ch.length; i++){
            if ('D' == ch[i]) {
                count = count - 1;
            }

            if ('U' == ch[i]) {
                count = count + 1;
            }

            // Start of Valley
            if (count == -1) {
                i = traverseValley(i , ch);
                if (i == -1) {
                    break;
                }
                noOfValleys++;
                count = 0;
            }

        }
        return noOfValleys;
    }

    private static int traverseValley(int pointInValley, char[] ch) {
        int count = 0;
        while(pointInValley < ch.length) {
            if ('D' == ch[pointInValley]) {
                count = count - 1;
            }

            if ('U' == ch[pointInValley]) {
                count = count + 1;
            }

            if (count == 0 ) {
                return pointInValley;
            }

            pointInValley++;
        }
        return -1;
    }
}
