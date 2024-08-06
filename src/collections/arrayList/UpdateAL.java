package collections.arrayList;

import java.util.ArrayList;

// Write a Java program to update an array element by the given element.
public class UpdateAL {
    public static void main(String[] args) {
        ArrayList<String> myArrayList = new ArrayList<String>();

        myArrayList.add("Red");
        myArrayList.add("Orange");
        myArrayList.add("Blue");

        String newElement = "Yellow";

        /*myArrayList.remove("Orange");
        myArrayList.add(1,newElement);*/

        myArrayList.set(1, newElement);
        // Either approach will work

        System.out.println(myArrayList);
    }
}
