package collections.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleReverseAL {

    public static void main(String[] args) {

        List<String> myArrayList = new ArrayList<String>();

        myArrayList.add("Red");
        myArrayList.add("Orange");
        myArrayList.add("Blue");
        myArrayList.add("Yellow");

        Collections.shuffle(myArrayList);
        System.out.println("After shuffle");
        System.out.println(myArrayList);

        System.out.println("After reverse");
        Collections.reverse(myArrayList);
        System.out.println(myArrayList);

    }
}
