package collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {

        List<String> myArrayList = new ArrayList<>();

        myArrayList.add("Apple");
        myArrayList.add("Banana");
        myArrayList.add("Coke");
        myArrayList.add("Banana");

        myArrayList.add(1, "Cherry");

        System.out.println("Second element of myArrayList: "+ myArrayList.get(1));
    }
}
