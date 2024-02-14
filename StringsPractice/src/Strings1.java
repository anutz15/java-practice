import java.util.*;

public class Strings1 {
    public static void main(String[] args) {

//        *** STRINGS ARE IMMUTABLE - no delete, no add
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
//        System.out.println("My name is: "+name);

//        System.out.println(name.length());

//        to access every character in string use .charAt(i)
        for(int i=0; i<name.length(); i++){
            System.out.print(name.charAt(i) + " ");
        }
        sc.close();
    }
}