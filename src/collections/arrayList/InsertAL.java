package collections.arrayList;

import java.util.ArrayList;

// Write a Java program to insert an element into the array list at the first position.
public class InsertAL {
    public static void main(String[] args) {
        ArrayList<String> myArrayList = new ArrayList<String>();

        myArrayList.add("Red");
        myArrayList.add("Orange");
        myArrayList.add("Blue");

        myArrayList.add(0,"Voilet");

        System.out.println(myArrayList);
    }
}
