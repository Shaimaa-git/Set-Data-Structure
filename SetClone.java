import java.util.HashSet;
import java.util.Set;

public class ShallowCopyExample {

    public static void main(String[] args) {
        // Create a HashSet<String>
        Set<String> originalSet = new HashSet<>();
        originalSet.add("Apple");
        originalSet.add("Banana");
        originalSet.add("Cherry");

        // Create a shallow copy of the original set
        Set<String> copySet = new HashSet<>(originalSet);

        // Add a new element to the copy set
        copySet.add("Orange");

        // Print both sets to observe that they are separate
        System.out.println("Original Set: " + originalSet);
        System.out.println("Copy Set: " + copySet);
    }
}
