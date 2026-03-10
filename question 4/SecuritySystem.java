import java.util.*;

public class SecuritySystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> arr = new ArrayList<>();

        while (sc.hasNextInt()) {
            stack.push(sc.nextInt());
        }

        while (!stack.isEmpty()) {
            arr.add(stack.pop());
        }

        Collections.sort(arr);

        for (int i = arr.size() - 1; i >= 0; i--) {
            stack.push(arr.get(i));
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}

