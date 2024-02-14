import java.util.*;

public class Arrays7 {
    public static void main(String[] args) {
        // reverse an array
        int[] arr={1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        reverse(arr);
    }
    static void reverse(int[] arr) {
        int start=0,end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
