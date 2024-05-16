/**
 * Ques 6 : Write a program to create a TreeSet of Integer type and perform the below
 * operation on it.
 * (a.) Display the TreeSet
 * (b.) Ask the user to enter a number and search that number is it present in the
 * list or not.
 * (c.) Remove an element from tree.
 */
package GenericsAndCollections2;
import java.util.Scanner;
import java.util.TreeSet;

public class prog6 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);

        treeSet.add(20);
        treeSet.add(40);
        treeSet.add(60);
        treeSet.add(80);
        treeSet.add(100);

        System.out.println("TreeSet elements: " + treeSet);

        System.out.print("Enter a number to search: ");
        int num = scanner.nextInt();
        if (treeSet.contains(num)) {
            System.out.println(num + " is present in the TreeSet.");
        } else {
            System.out.println(num + " is not present in the TreeSet.");
        }

        System.out.print("Enter an element to remove: ");
        int removeNum = scanner.nextInt();
        if (treeSet.contains(removeNum)) {
            treeSet.remove(removeNum);
            System.out.println("Element " + removeNum + " removed from TreeSet.");
        } else {
            System.out.println("Element " + removeNum + " not found in the TreeSet.");
        }

        System.out.println("Updated TreeSet elements: " + treeSet);
    }
}

/**
 * OUTPUT :
 *
 * TreeSet elements: [20, 40, 60, 80, 100]
 * Enter a number to search: 60
 * 60 is present in the TreeSet.
 * Enter an element to remove: 40
 * Element 50 removed from TreeSet.
 * Updated TreeSet elements: [20, 60, 80, 100]
 */