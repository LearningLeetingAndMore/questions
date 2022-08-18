import java.util.Arrays;

public class threeLargestNumbers {
    public static int[] findThreeLargestNumbers(int[] array) {
        // Write your code here.
        if (array == null || array.length == 0) {
            return null;
        }
        if (array.length <= 3) {
            return Arrays.stream(array).sorted().toArray();
        }

        int firstLargest = array[0];
        int secondLargest = array[1];
        int thirdLargest = array[2];



        for (int i = 3; i < array.length; i++) {
            int element = array[i];
            if (element > thirdLargest && element <= secondLargest) {
                thirdLargest = element;
            } else if (element > secondLargest && element <= firstLargest) {
                secondLargest = element;
            } else if (element > firstLargest) {
                firstLargest = element;
            }
        }

        int [] result = new int[]{firstLargest, secondLargest, thirdLargest};
        result = Arrays.stream(result).sorted().toArray();

        return result;
    }
}
