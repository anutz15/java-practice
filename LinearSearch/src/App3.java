import java.util.*;

public class App3 {
    public static void main(String[] args) {
        int[][] arr={
            {1,2,3},
            {2,3,4,5}
        };
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        int[] result=search(arr, target);
        System.out.println(Arrays.toString(result));

        sc.close();
    }

    static int[] search(int[][] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]==target) return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }
}
