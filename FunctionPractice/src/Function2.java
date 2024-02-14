package Functions;
import java.util.*;

public class Function2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            System.out.println(printFibonacci(i) + " ");
        }
    }

    static int printFibonacci(int n) {
        // to print fibonacci series
        if (n==0){
            return 0;
        } else if (n==1){
            return 1;
        } else {
            return printFibonacci(n-2) + printFibonacci(n-1);
        }
    }
}
