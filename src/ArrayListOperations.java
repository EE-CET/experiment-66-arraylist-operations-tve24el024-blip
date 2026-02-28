import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read number of items
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline

        // Read items line
        String[] input = scanner.nextLine().split(" ");

        // Store in ArrayList
        ArrayList<String> items = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            items.add(input[i]);
        }

        // Sort alphabetically
        Collections.sort(items);

        // Read search item
        String search = scanner.nextLine();

        // Check if exists
        if (items.contains(search)) {
            System.out.println("Sorted Items: " + items);
            System.out.println("Found");
        } else {
            System.out.println("Sorted Items: " + items);
            System.out.println("Not Found");
        }

        scanner.close();
    }
}