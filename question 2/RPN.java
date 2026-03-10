import java.util.Scanner;
import java.util.Stack;

public class RPN {

    public static int evaluate_rpn(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String t : tokens) {

            if (t.equals("+") || t.equals("-") || 
                t.equals("*") || t.equals("/")) {

                int b = stack.pop();
                int a = stack.pop();

                int result = 0;

                switch (t) {
                    case "+":
                        result = a + b;
                        break;
                    case "-":
                        result = a - b;
                        break;
                    case "*":
                        result = a * b;
                        break;
                    case "/":
                        result = a / b; 
                        break;
                }

                stack.push(result);

            } else {
                stack.push(Integer.valueOf(t));
            }
        }

        int finalResult = stack.pop();
        return finalResult + 13;
}

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input RPN: ");
        String[] tokens = sc.nextLine().split(" ");

        System.out.println("Result: " + evaluate_rpn(tokens));
    }
}
