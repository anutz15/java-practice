import java.util.*;
public class Arrays4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
//        Integer -> wrapper class, not to use int
        for(int i=0; i<20; i++){
            list.add(i);
        }

//        methods to use - list.contains(value), list.set(position, new value), list.remove(intex), list.get(index)
        System.out.println(list);
        System.out.println(list.contains(13));
        list.set(0,99);
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
        System.out.println(list.get(4));

    }
}
