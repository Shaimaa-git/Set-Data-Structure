import java.util.HashSet;
import java.util.Set;

public class NestedHashSetExample {

    public static void main(String[] args) {
        // Create a HashSet<HashSet<Integer>>
        Set<Set<Integer>> nestedSet = new HashSet<>();

        // Create and add several HashSet<Integer> objects to the nested set
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

        nestedSet.add(set1);
        nestedSet.add(set2);
        nestedSet.add(set3);

        // Print all unique integers from all sets combined
        printCombinedIntegers(nestedSet);
    }

    // Function to print all unique integers from all sets combined
    private static void printCombinedIntegers(Set<Set<Integer>> nestedSet) {
        Set<Integer> combinedSet = new HashSet<>();

        for (Set<Integer> innerSet : nestedSet) {
            combinedSet.addAll(innerSet);
        }

        System.out.println("Combined unique integers from all sets: " + combinedSet);
    }
}
