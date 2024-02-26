import java.util.HashSet;
import java.util.Set;
public class Main {
    public static void main(String[] args) {
        Set<String> GreatingSet = new HashSet<>();
        GreatingSet.add("hi");
        GreatingSet.add("Hello");
        GreatingSet.add("Assalam Alikum");
        //clear the all elements of the set
        GreatingSet.clear();
        int theSize=GreatingSet.size();
        //verify that all element of the set was deleted by printing the size
        System.out.println("THE SIZE OF THE SET AFTER CLEAR:"+theSize);
    }
}