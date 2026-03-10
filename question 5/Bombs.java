import java.util.Scanner;
import java.util.Stack;

public class Bombs {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Stack<Integer> stack = new Stack<>();

        while (n >= 1) {
            stack.push(n);
            n = n / 2;
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
            if (!stack.isEmpty()) {
                System.out.print(" ");
            }
        }
    }
}