package collections.arrayList;

import java.util.ArrayList;

//Write a Java program to create an array list, add some colors (strings) and print out the collection.
public class CreateAL {
    public static void main(String[] args) {
        ArrayList<String> myArrayList = new ArrayList<String>();

        myArrayList.add("Red");
        myArrayList.add("Orange");
        myArrayList.add("Blue");

        /*for(String str:myArrayList){
            System.out.println(str);
        }*/
        System.out.println(myArrayList);
        // Either sys out will work
    }
}
