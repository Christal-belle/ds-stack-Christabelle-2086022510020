import java.util.*;

public class SecuritySystem {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            Stack<Integer> stack = new Stack<>();
            ArrayList<Integer> arr = new ArrayList<>();
            
            while (sc.hasNextInt()) {       //apkh msh ad angka yg bsa dbaca
                stack.push(sc.nextInt());   //ambil angka berikut n mskkn ke dlm stack
            }
            
            while (!stack.isEmpty()) {      //klo stack ga kosong
                arr.add(stack.pop());       //ambil angka trs ksi msk ke array
            }
            
            for (int i = 0; i < arr.size() - 1; i++) {
                for (int j = 0; j < arr.size() - i - 1; j++) {
                    if (arr.get(j) > arr.get(j + 1)) {
                        int temp = arr.get(j);
                        arr.set(j, arr.get(j + 1));
                        arr.set(j + 1, temp);
                        
                    }
                }
            }
            
            for (int i = arr.size() - 1; i >= 0; i--) {
                stack.push(arr.get(i));         //menyimpan angka kembali ke stack
            }
            
            while (!stack.isEmpty()) {          //mengambil angka dri stack dan mencetak
                System.out.print(stack.pop() + " ");
            }
        }
    }
}

//dipandu oleh chatgpt dan ko Aristo