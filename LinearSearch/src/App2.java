// import java.util.*;
public class App2 {
    public static void main(String[] args) {
        // find minimum element in array
        int[] arr={1,2,-1,-2,-10};
        System.out.println(minElement(arr));
    }
    static int minElement(int[] arr){
        int min=arr[0];
        for(int i:arr){
            if(i<min) min=i;
        }
        return min;
    }
}
