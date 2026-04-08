import java.util.*;

public class ArrayListOperations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] items = sc.nextLine().split(" ");
        String search = sc.nextLine();

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(items[i]);
        }

        Collections.sort(list);

        System.out.println("Sorted Items: " + list);

        if (list.contains(search)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

        sc.close();
    }
}