package collections.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

//Write a Java program to iterate through all elements in an array list using the iterator.

public class IterateAL {
    public static void main(String[] args) {
        ArrayList<String> myArrayList = new ArrayList<String>();

        myArrayList.add("Red");
        myArrayList.add("Orange");
        myArrayList.add("Blue");

        Iterator iterator = myArrayList.iterator();

        while(iterator.hasNext()){
            Object str = iterator.next();
            System.out.println(str);

        }
    }
}
