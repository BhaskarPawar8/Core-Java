package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemoString {

    public static void main(String[] args) {

        // Sort  automatically sort by default logic.wihout comparator, strings are automatically sorted based on alphabetic sequence.
        // By giving comparator object, you define your logic to sort.
        // for this example, we are sorting the strings based on their size. It compares two strings at a time throughout the entire list
        Comparator<String> comp = new Comparator<String>() {
            @Override
            public int compare(String i, String j) {
                if( i.length() > j.length())
                    return 1;
                else
                    return -1;
            }

        };

        List<String> studs = new ArrayList<String>();

        studs.add("Brucefsdfsd");
        studs.add("Adam");
        studs.add("Zendy");
        studs.add("Stevenaf");

        Collections.sort(studs, comp);

        System.out.println(studs);
    }
}
