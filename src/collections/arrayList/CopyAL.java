package collections.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CopyAL {

    public static void main(String[] args) {

        List<String> myArrayList = new ArrayList<String>();

        myArrayList.add("Red");
        myArrayList.add("Orange");
        myArrayList.add("Blue");
        myArrayList.add("Yellow");


        List myNewArrayList = new ArrayList<String>();

        myNewArrayList.add("1");
        myNewArrayList.add("2");
        myNewArrayList.add("3");
        myNewArrayList.add("4");

        Collections.copy(myArrayList, myNewArrayList);


        System.out.println(myArrayList);


    }
}
