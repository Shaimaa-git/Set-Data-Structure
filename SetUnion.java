import java.util.HashSet;
import java.util.Set;

public class SetUnionExample {

    public static void main(String[] args) {
        // Create three HashSet<Integer> objects with numbers
        Set<Integer> set1 = new HashSet<>();
        set1.add(2);
        set1.add(4);
        set1.add(6);

        Set<Integer> set2 = new HashSet<>();
        set2.add(4);
        set2.add(6);
        set2.add(8);

        Set<Integer> set3 = new HashSet<>();
        set3.add(6);
        set3.add(8);
        set3.add(10);

        // Find and print the union of the three sets
        Set<Integer> union = findUnion(set1, set2, set3);

        System.out.println("Union of the three sets: " + union);
    }

    // Function to find the union of three sets
    private static Set<Integer> findUnion(Set<Integer> set1, Set<Integer> set2, Set<Integer> set3) {
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        union.addAll(set3);
        return union;
    }
}
