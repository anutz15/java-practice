package Functions;
import java.util.*;

public class Function1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int result = findFactorial(n);
        System.out.println("Factorial of " + n + " " + "is: " + result);
    }

    static int findFactorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*findFactorial(n-1);
    }
}