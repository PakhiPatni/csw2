/**
 * Ques 9 : Given an array of integers, print the repeating integers in the array with the help of a HashSet.
 */
package GenericsAndCollections2;
import java.util.HashSet;

public class prog9 {
    public static void main(String[] args) {
        int[] array = {3, 5, 10, 7, 8, 7, 3, 1};
        RepeatingIntegers(array);
    }

    public static void RepeatingIntegers(int[] array) {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> repeating = new HashSet<>();

        for (int num : array) {
            if (!seen.add(num)) {
                repeating.add(num);
            }
        }
        if (!repeating.isEmpty()) {
            System.out.println("Repeating integers in the array:");
            for (int num : repeating) {
                System.out.print(num+" ");
            }
        } else {
            System.out.println("No repeating integers found in the array.");
        }
    }
}

/**
 * OUTPUT :
 *
 * Repeating integers in the array:
 * 3 7
 */