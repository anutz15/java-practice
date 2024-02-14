import java.util.*;
public class Arrays2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>(n);
        for(int i=0;i<n;i++){
            arr.add(i);
        }
//        for(int i=0;i<n;i++){
//            System.out.print((arr.get(i)+1)+" ");
//        }

        for(int num:arr){
            System.out.print(num+" ");
        }

        sc.close();
    }
}
