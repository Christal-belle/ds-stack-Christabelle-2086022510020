import java.util.Scanner;
import java.util.Stack;

public class Bracket {

    public static boolean is_balanced(String s) {
        Stack<Character> stack = new Stack<>(); //tumpukan kosong

        for (char c : s.toCharArray()) {   //jadi kata dalam String bisa tersimpan per karakter

            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }

            else if (c == ')' || c == '}' || c == ']') {

                if (stack.isEmpty()) {    //ada kurung tutup tpi dk ada mi kurung bukany
                    return false;
                }
                char top = stack.pop(); 
                
                if (!isMatching(top, c)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static boolean isMatching(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bracket sequence: ");
        String s = input.nextLine();

        if (is_balanced(s)) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }

        input.close();
    }
}




//Credit: chatgpt pada bagian public static boolean is_balanced(String s) {