import java.util.HashSet;
import java.util.Set;

public class SetManipulationExample {

    public static void main(String[] args) {
        // Create a set
        Set<Integer> numberSet = new HashSet<>();

        // Add elements to the set
        numberSet.add(1);
        numberSet.add(2);
        numberSet.add(3);
        numberSet.add(4);
        numberSet.add(5);

        // Print the set before removal
        System.out.println("Set before removal: " + numberSet);

        // Remove the number 3 from the set
        numberSet.remove(3);

        // Print the set after removal
        System.out.println("Set after removal: " + numberSet);
    }
}
