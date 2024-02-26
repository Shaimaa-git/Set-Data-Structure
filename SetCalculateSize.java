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
         //calculate the size of set
         int theSizeOfSet=myset.size();

         //print the size of the set
        System.out.println("The size of the set is: "+theSizeOfSet);
    }
}