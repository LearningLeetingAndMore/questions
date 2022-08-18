public class AmPmConversion {
    public static String timeConversion(String s) {
        // Write your code here
        if (s == null || s.isBlank()) {
            return "";
        }

        String amPm = s.substring(s.length() - 2);
        int hour = Integer.parseInt(s.substring(0, 2));
        String restOfTime = s.substring(2, s.length() - 2);
        hour = amPm.equalsIgnoreCase("AM") ? hour % 12 : 12 + (hour % 12);
        return hour < 10 ? "0" + hour + restOfTime : hour + restOfTime;
        //                   AM                       PM
        // 12 1 2 3 4 5 6 7 8 9 10 11      12 1  2  3  4  5  6  7  8  9  10 11
        // 0  1 2 3 4 5 6 7 8 9 10 11      12 13 14 15 16 17 18 19 20 21 22 23
        // if time AM  24 Hrs = HR % 12    if time PM  then 24 Hrs = 12 + HR % 12
    }
}
