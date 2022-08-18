import java.util.Arrays;

public class SortedSquaredArray {

    public static int[] sortedSquaredArray(int[] array) {
        // Write your code here.
        for(int i = 0; i< array.length; i++) {
            array[i] *= array[i];
        }
        Arrays.sort(array);
        return array;
    }
}
