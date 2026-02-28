import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        input.nextLine();

        String[] items = input.nextLine().split(" ");
        ArrayList<String> cart = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            cart.add(items[i]);
        }

        Collections.sort(cart);

        String search = input.nextLine();

        System.out.println("Sorted Items: " + cart);
        System.out.println(cart.contains(search) ? "Found" : "Not Found");

        input.close();
    }
}