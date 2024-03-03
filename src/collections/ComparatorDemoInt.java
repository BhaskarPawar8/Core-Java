package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemoInt {

    public static void main(String[] args) {

        // Sort  automatically sort by default logic.wihout comparator, integers are automatically sorted in ascending order.
        // By giving comparator object, you define your logic to sort.
        // for this example, we are sorting the numbers based on their remainders. It compares two ints at a time throughout the entire list
        Comparator<Integer> comp = new Comparator<Integer>() {
            @Override
            public int compare(Integer i, Integer j) {
                if( i > j)
                    return 1;
                else
                    return -1;
            }

        };

        List<Integer> intList = new ArrayList<Integer>();

        intList.add(12);
        intList.add(34);
        intList.add(31);
        intList.add(98);

        Collections.sort(intList, comp);

        System.out.println(intList);
    }
}
