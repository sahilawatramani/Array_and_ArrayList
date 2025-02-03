import java.util.*;
import java.lang.Math;

class ArrayFunctions {

    // Instance variables to store array and arrayList internally
    private int[] array;
    private ArrayList<Integer> arrayList;

    // Constructor to initialize array and ArrayList
    ArrayFunctions() {
        Input in = new Input();
        this.array = in.arrayInput(); // Taking input for the array
        this.arrayList = new ArrayList<>(); // Empty initial ArrayList
    }

    // Display the contents of an ArrayList
    void display(ArrayList<Integer> array) {
        System.out.println("Array is: " + array);
    }

    // Split elements into even and odd lists and display them
    void evenOdd() {
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        // Traverse the array to segregate even and odd numbers
        for (int num : array) {
            if (num % 2 == 0) {
                even.add(num);
            } else {
                odd.add(num);
            }
        }

        // Display even and odd lists
        display(even);
        display(odd);
    }

    // Find the smallest difference between two elements in the array
    void smallestDifference() {
        int minDiff = Integer.MAX_VALUE; // Initial high value for comparison
        int minIndex = 0;

        // Nested loop to check pairwise differences
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int absDiff = Math.abs(array[i] - array[j]);
                if (absDiff < minDiff) {
                    minDiff = absDiff;
                    minIndex = i;
                }
            }
        }
        System.out.println("Minimum Index = " + minIndex);
    }

    // Convert array to ArrayList and print the result
    void arrayToArrayList() {
        arrayList.clear(); // Clear the ArrayList before conversion
        for (int i : array) {
            arrayList.add(i); // Add elements from the array to ArrayList
        }
        System.out.println("Array List = " + arrayList);
    }

    // Convert ArrayList back to an array and print the result
    void arrayListToArray() {
        int[] convertedArray = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            convertedArray[i] = arrayList.get(i); // Copy ArrayList elements
        }
        System.out.println("Array: " + Arrays.toString(convertedArray));
    }
}
