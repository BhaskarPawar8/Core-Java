package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {
    public static void main(String[] args) {

        Map<String, Integer> hashMapEmployee = new HashMap<>();

        hashMapEmployee.put("Alice", 23);
        hashMapEmployee.put("Bob", 29);
        hashMapEmployee.put("Charlie", 25);
        hashMapEmployee.put("Bob", 20);

        System.out.println("HashMap: Emplyee: " + hashMapEmployee.get("Bob"));


        Map<String, Integer> treeMapEmployee = new TreeMap<>();

        treeMapEmployee.put("Alice", 23);
        treeMapEmployee.put("Bob", 29);
        treeMapEmployee.put("Charlie", 25);
        treeMapEmployee.put("Bob", 20);

        System.out.println("TreeMap: Emplyee: " + treeMapEmployee.get("Charlie"));
    }
}
