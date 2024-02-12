import java.util.Arrays;
public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        // find a character exist in array or not
        String str="Anuj";
        char target='A';
        System.out.println(search(str,target));

        // to print char array in one line
        System.out.println(Arrays.toString(str.toCharArray()));
    }
    // static boolean search(String str, char target){
    //     if(str.length()==0) return false;

    //     for (int i = 0; i < str.length(); i++) {
    //         if(target==str.charAt(i)){
    //             return true;
    //         }
    //     }
    //     return false;
    // }
    static boolean search(String str, char target){
        // this method involves converting string to array
        for (char ch : str.toCharArray()) {
            if(ch==target) return true;
        }
        return false;
    }
}
