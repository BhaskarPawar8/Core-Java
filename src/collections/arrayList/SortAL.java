package collections.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Write a Java program to sort a given array list.
public class SortAL {

    public static void main(String[] args) {

        ArrayList<String> myArrayList = new ArrayList<String>();

        myArrayList.add("Red");
        myArrayList.add("Orange");
        myArrayList.add("Blue");
        myArrayList.add("Yellow");

        /*Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };
        myArrayList.sort(comparator);*/

        Collections.sort(myArrayList);
        // Either solution will work

        System.out.println(myArrayList);


    }
}

