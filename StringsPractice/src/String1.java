public class String1 {
    public static void main(String[] args) {
        String a="Anuj";
        String b="Anuj";
        System.out.println(a==b);   // true as both a,b will point to same Anuj in String pool in heap

        String name1=new String("Anuj");
        String name2=new String("Anuj");

        System.out.println(name1==name2);   // false as it will point to 2 different Anuj outside String Pool but ofc inside heap

        a="shah";
        System.out.println(a);   // this a will now point to new string shah, it will not overwrite anuj, b is still pointing to anuj - immutability for security  reasons
        
    }
}
