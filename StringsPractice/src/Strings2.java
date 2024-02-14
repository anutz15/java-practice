import java.util.*;

public class Strings2 {
    public static void main(String[] args) {
        // strings comparision
        Scanner sc = new Scanner(System.in);
//        Condition1-> s1 > s2     hello > cello
//        Condition2-> s1=s2      hello = hello
//        Condtition3-> s1<s2       bello < hello

//        letter comparision thae

        String name1 = "Anuj";
        String name2 = "Anuj";

//        if(name1.compareTo(name2)==0) System.out.println("Strings are equal");
//        else System.out.println("String are not equal");
//        sc.close();


//        *** But when comparing 2 strings, use .compareTo() only as == may give errors
//        if(name1 == name2) System.out.println("Equal");
//        else System.out.println("Not equal");

        if(new String("Shah") == new String("Shah")) System.out.println("Equal");
        else System.out.println("Not equal");


//        strings - object in java
//        how objects stored in memory is diff funcntioning while other primitive types have different functioning
        
    }
}
