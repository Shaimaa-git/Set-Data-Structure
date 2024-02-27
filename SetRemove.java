import java.util.HashSet;
import java.util.Set;
public class Main {
    public static void main(String[] args) {
         Set <Integer> mySet=new HashSet<>();
         mySet.add(1);
         mySet.add(2);
         mySet.add(3);
         mySet.add(4);
         mySet.add(5);
         //print the set before removing
         System.out.println("Set before removing 3: "+mySet);
         //remove number 3
         mySet.remove(3);
         //print the set after removing
        System.out.println("Set after remove number 3: "+mySet);
    }
}
