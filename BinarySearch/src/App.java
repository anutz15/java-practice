public class App {
    public static void main(String[] args) throws Exception {
        // Binary search algorithm with questions
        // you need sorted array to apply binary search
        // best case scenario-if middle element == key, found in 1st attempt O(1)
        // worst case- O(logn)  

        // if descending order then all start,end updation conditions will reverse
        // compare first and last element,accordingly apply the conditions 
        int[] arr={1,2,3,4,5,11,15,20,35,40,41};
        int key=412;
        // int start=0,end=arr.length-1;
        // print index value if found else -1
        // System.out.println(BinarySearchRecursive(arr,key,start,end));
        System.out.println(BinarySearch(arr,key));
    }

    static int BinarySearch(int[] arr,int key){
        int start=0, end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==key) return mid;
            else if(arr[mid]<key){
                start=mid+1;
            }
            else end=mid-1;
        }
        // if return hit nai thae then target element not found, return -1
        return -1;
    }

    // recursion approach
    static int BinarySearchRecursive(int[] arr,int key, int start, int end){
        // edge case
        if(arr.length==0) return -1;
        if(start>end) return -1;  // does not exist in array
        // int mid=(start+end)/2;     // ***IMP don't use this way, if start+mid very large can go out of range of int
        int mid=start+(end-start)/2;
        if(arr[mid]<key) return BinarySearchRecursive(arr, key, mid+1, end);
        else if(arr[mid]>key) return BinarySearchRecursive(arr, key, start, mid-1);
        else return mid; 
    }
    
}
