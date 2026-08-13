package collections.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Write a Java program to sort a given array list.
public class SortALComparable {

    public static void main(String[] args) {

        ArrayList<String> myArrayList = new ArrayList<String>();


        myArrayList.add("Red");
        myArrayList.add("Yellow");
        myArrayList.add("Orange");
        myArrayList.add("Blue");

        Collections.sort(myArrayList);

        System.out.println(myArrayList);

    }
}

/*
Why String can't be modified with Comparable?

Comparable defines the natural ordering of an object directly inside its class definition by implementing public int compareTo(T o).

Java's String class already implements Comparable<String>, and its natural ordering is standard alphabetical order ("Blue" → "Orange" → "Red" → "Yellow"). Because String is a final built-in class, you cannot modify its compareTo method to sort by the last character.


 */
