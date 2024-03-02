import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println("Before sorting: "+Arrays.toString(arr));
        System.out.println("After sorting: "+Arrays.toString(sort(arr)));
    }

    static int[] sort(int[] arr){
        boolean swapped=false;

        // n-1 times loop run required
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                // swapp if condition matches
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;

                    swapped=true;
                }
            }
            // if already sorted then return array, no need to check again
            if(!swapped) return arr;   
        }

        return arr;
    }
}
