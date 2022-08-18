import java.util.List;

public class PlusMinus {


    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        if (arr == null || arr.isEmpty()) {
            System.out.printf("%.6f%n", 0.0);
            System.out.printf("%.6f%n", 0.0);
            System.out.printf("%.6f%n", 0.0);
        } else {
            double positive = 0, negative = 0, zero = 0;
            double totalElements = arr.size();
            for (Integer element : arr) {
                if (element > 0) {
                    positive++;
                } else if (element < 0) {
                    negative++;
                } else {
                    zero++;
                }
            }

            System.out.printf("%.6f%n", positive/totalElements);
            System.out.printf("%.6f%n", negative/totalElements);
            System.out.printf("%.6f%n", zero/totalElements);
        }
    }
}
