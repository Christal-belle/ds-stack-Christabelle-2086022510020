import java.util.*;

public class ChronoStackEngine {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        StringBuilder result = new StringBuilder();

        for(int x : arr){

            // mulai dari seed
            result.append("1");

            int value = 1;

            while(value < x){
                result.append("d");
                value += 13;

                if(value > x){
                    result.append("+");
                    value = value - 1;
                }
            }

            result.append("+");
        }

        System.out.println(result.toString());
    }
}