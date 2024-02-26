import java.util.HashSet;
import java.util.Set;
public class Main {
    public static void main(String[] args) {
         Set <Integer> myset=new HashSet<>();
         myset.add(2);
         myset.add(4);
         myset.add(4);
         myset.add(5);
         myset.add(6); 
         myset.add(6);

         //print the set to check what happened to the duplicate elements
        System.out.println(myset);
    }
}