package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemoInt {

    public static void main(String[] args) {

        Comparator<Integer> comp = new Comparator<Integer>() {
            @Override
            public int compare(Integer i, Integer j) {
                if( i%10 > j%10)
                    return 1;
                else
                    return -1;
            }

        };

        List<Integer> intList = new ArrayList<Integer>();

        intList.add(12);
        intList.add(34);
        intList.add(3);
        intList.add(9);

        Collections.sort(intList, comp);

        System.out.println(intList);
    }
}
