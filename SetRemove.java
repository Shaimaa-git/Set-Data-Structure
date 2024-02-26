import java.util.HashSet;
import java.util.Set;
public class Main {
    public static void main(String[] args) {
         Set <Integer> myset=new HashSet<>();
         myset.add(1);
         myset.add(2);
         myset.add(3);
         myset.add(4);
         myset.add(5);
         //print the set before removing
         System.out.println("Set before removing 3: "+myset);
         //remove number 3
         myset.remove(3);
         //print the set after removing
        System.out.println("Set after remove number 3: "+myset);
    }
}