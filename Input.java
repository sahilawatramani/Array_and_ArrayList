import java.util.*;

class Input {

    // Function to take array input from the user
    int[] arrayInput() {

        int[] array = new int[5]; // Fixed-size array for input
        Scanner scan = new Scanner(System.in);

        // Prompt the user to enter 5 numbers
        System.out.println("Enter 5 numbers: ");

        // Read input into the array
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }

        return array; // Return the filled array
    }
}
