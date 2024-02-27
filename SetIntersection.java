import java.util.HashSet;
import java.util.Set;

public class SetIntersectionExample {

    public static void main(String[] args) {
        // Create two HashSet<Integer> objects with numbers
        Set<Integer> set1 = new HashSet<>();
        set1.add(2);
        set1.add(4);
        set1.add(6);
        set1.add(8);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(6);
        set2.add(8);
        set2.add(10);

        // Find and print the intersection of the two sets
        Set<Integer> intersection = findIntersection(set1, set2);

        System.out.println("Intersection of the two sets: " + intersection);
    }

    // Function to find the intersection of two sets
    private static Set<Integer> findIntersection(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        return intersection;
    }
}
