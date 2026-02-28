import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListOperations {
    public static void main(String[] args) {

        // Step 1: Read input
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();     // Number of items
        input.nextLine();            // Consume leftover newline

        // Read the shopping items
        String line = input.nextLine();
        String[] words = line.split(" ");

        // Step 2: Store items in ArrayList
        ArrayList<String> cart = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            cart.add(words[i]);
        }

        // Step 3: Sort items alphabetically
        Collections.sort(cart);

        // Step 4: Read item to search
        String searchItem = input.nextLine();

        // Step 5: Print sorted list
        System.out.println("Sorted Items: " + cart);

        // Step 6: Check if item exists
        if (cart.contains(searchItem)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

        input.close();
    }
}