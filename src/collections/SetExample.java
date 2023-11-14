package collections;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        // Create a HashSet (a common implementation of Set)
        Set<String> fruits = new HashSet<>();

        // Add elements to the set
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");

        // Check if the set contains an element
        boolean containsBanana = fruits.contains("banana"); // true

        // Remove an element from the set
        fruits.remove("cherry");

        // Get the number of elements in the set
        int size = fruits.size(); // 2

        // Check if the set is empty
        boolean isEmpty = fruits.isEmpty(); // false

        // Clear the set (remove all elements)
        fruits.clear();

        // Check if the set is empty after clearing
        isEmpty = fruits.isEmpty(); // true
    }
}
