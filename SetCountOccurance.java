import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountOccurrencesExample {

    public static void main(String[] args) {
        // Create a List<Integer> with duplicates
        List<Integer> numbersList = new ArrayList<>();
        numbersList.add(2);
        numbersList.add(4);
        numbersList.add(2);
        numbersList.add(6);
        numbersList.add(4);
        numbersList.add(8);

        // Print each unique number along with its occurrences
        printUniqueNumbersWithCount(numbersList);
    }

    // Function to print each unique number along with its occurrences
    private static void printUniqueNumbersWithCount(List<Integer> numbersList) {
        Set<Integer> uniqueNumbers = new HashSet<>(numbersList);

        for (Integer number : uniqueNumbers) {
            int occurrences = countOccurrences(numbersList, number);
            System.out.println("Number: " + number + ", Occurrences: " + occurrences);
        }
    }

    // Helper function to count occurrences of a number in the list
    private static int countOccurrences(List<Integer> numbersList, int target) {
        int count = 0;
        for (Integer number : numbersList) {
            if (number == target) {
                count++;
            }
        }
        return count;
    }
}
