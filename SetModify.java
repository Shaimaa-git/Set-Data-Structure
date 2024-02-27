import java.util.HashSet;
import java.util.Set;

public class SetModificationExample {

    public static void main(String[] args) {
        // Create two HashSet<Integer> objects
        Set<Integer> set1 = new HashSet<>();
        set1.add(2);
        set1.add(4);
        set1.add(6);
        set1.add(8);

        Set<Integer> set2 = new HashSet<>();
        set2.add(4);
        set2.add(6);
        set2.add(10);

        // Modify set1 to remove elements not found in set2
        modifySet(set1, set2);

        System.out.println("Modified set1: " + set1);
    }

    // Function to modify the first set by removing elements not found in the second set
    private static void modifySet(Set<Integer> set1, Set<Integer> set2) {
        set1.retainAll(set2);
    }
}
