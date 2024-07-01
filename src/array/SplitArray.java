package array;
import java.util.*;

public class SplitArray

{

    public static List<int[]> splitArray(int[] original, int splitSize) {
        List<int[]> result = new ArrayList<>();

        for (int i = 0; i < original.length; i += splitSize) {
            int end = Math.min(original.length, i + splitSize);
            int[] chunk = new int[end - i];
            System.arraycopy(original, i, chunk, 0, end - i);
            result.add(chunk);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] original = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int splitSize = 3;

        List<int[]> chunks = splitArray(original, splitSize);

        for (int[] chunk : chunks) {
            for (int num : chunk) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
