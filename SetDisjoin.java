import java.util.HashSet;
import java.util.Set;

public class SetDisjointExample {

    public static void main(String[] args) {
        // Create two HashSet<String> objects with names
        Set<String> set1 = new HashSet<>();
        set1.add("Alice");
        set1.add("Bob");
        set1.add("Charlie");

        Set<String> set2 = new HashSet<>();
        set2.add("David");
        set2.add("Eva");
        set2.add("Alice"); // Common element with set1

        // Check if the sets are disjoint and print the result
        if (areSetsDisjoint(set1, set2)) {
            System.out.println("Disjoint");
        } else {
            System.out.println("Not Disjoint");
        }
    }

    // Function to check if two sets are disjoint
    private static boolean areSetsDisjoint(Set<String> set1, Set<String> set2) {
        return !set1.stream().anyMatch(set2::contains);
    }
}
