import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        String[] input = scanner.nextLine().split(" ");
        ArrayList<String> items = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            items.add(input[i]);
        }

        Collections.sort(items);

        String search = scanner.nextLine();

        System.out.println("Sorted Items: " + items);
        System.out.println(items.contains(search) ? "Found" : "Not Found");

        scanner.close();
    }
}