public class Question1 {
    public static void main(String[] args) {
        // how many numbers in array have even number of digits?
        int[] arr={12,234,1,1023,29929,292,2919,2919};
        int result=findNumbers(arr);
        System.out.println(result);
    }
    static int findNumbers(int[] arr){
        int result=0;
        for(int number:arr){
            int length=0;
            while(number>0){
                length++;
                number/=10;
            }
            if(length%2==0) result++;
        }
        return result;
    }
}
