import java.util.HashSet;
import java.util.Set;
public class Main {
    public static void main(String[] args) {
        Set<String> fruitSet = new HashSet<>();
        fruitSet.add("Apple");
        fruitSet.add("Banana");
        fruitSet.add("Cherry");
        fruitSet.add("Orange");
        fruitSet.add("Grapes");

        // Print each fruit name individually using for loop
        System.out.println("Fruits in the Set:");
        for (String fruit : fruitSet) {
            System.out.println(fruit);
        }

    }
}