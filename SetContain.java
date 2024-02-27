import java.util.HashSet;
import java.util.Set;
public class Main {
    public static void main(String[] args) {
         Set <String> myset=new HashSet<>();
         myset.add("Shaima");
         myset.add("Salim");
         myset.add("John");
         myset.add("Afnan");
         myset.add("Sulaiman");
         //print the set
        System.out.println(myset);
        //check if name John is found
        if(myset.contains("John"))
        {
            System.out.println("Name John is found");
        }
        else{
            System.out.println("Name John is not found");
        }
    }
}
