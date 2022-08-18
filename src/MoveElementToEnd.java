import java.util.ArrayList;
import java.util.List;

public class MoveElementToEnd {
    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        // Write your code here.
        int endOfListPosition = array.size() - 1, i = 0;
        while (i < endOfListPosition) {
            int elementAtLastPosition = array.get(endOfListPosition);
            int elementInCurrentPosition = array.get(i);
            if (elementAtLastPosition == toMove) {
                endOfListPosition--;
                continue;
            }

            if (elementInCurrentPosition != toMove) {
                i++;
                continue;
            }

            array.set(endOfListPosition, toMove);
            array.set(i, elementAtLastPosition);
        }

        return array;
    }
}
