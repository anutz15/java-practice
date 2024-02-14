import java.util.*;

public class Strings4 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Anuj");

        System.out.println(str.charAt(0));

        str.setCharAt(3,'x');
        System.out.println(str);

        str.insert(0,'E');
        System.out.println(str);

        str.delete(0,1);
        System.out.println(str);


        str.append("el");
        System.out.println(str);
    }
}
