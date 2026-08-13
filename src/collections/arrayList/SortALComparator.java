package collections.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Write a Java program to sort a given array list.
public class SortALComparator {

    public static void main(String[] args) {

        ArrayList<String> myArrayList = new ArrayList<String>();


        myArrayList.add("Red");
        myArrayList.add("Yellow");
        myArrayList.add("Orange");
        myArrayList.add("Blue");


        Comparator<String> myComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                char a1 = o1.charAt(o1.length() -1);
                char a2 = o2.charAt(o2.length() -1 );
                return Character.compare(a1,a2);
            }
        };


        //myArrayList.sort(myComparator);
        Collections.sort(myArrayList, myComparator);
        // Either solution will work

        System.out.println(myArrayList);


    }
}

/*
A Comparator defines an external rule for ordering two objects (o1 and o2).
Step-by-Step Execution

1. Anonymous Class Creation:

Java
Comparator<String> myComparator = new Comparator<String>() { ... };

This creates an anonymous inner class that implements the Comparator<String> interface and overrides its compare method.

2. Extracting the Last Characters:

Java
char a1 = o1.charAt(o1.length() - 1); // Last character of the first string
char a2 = o2.charAt(o2.length() - 1); // Last character of the second string

For any two strings being compared, the code ignores everything except their final characters.

3. The Comparison Rule (compare(o1, o2)):

Java
return Character.compare(a1, a2);

The compare method follows a strict contract. It compares the ASCII/Unicode numeric values of a1 and a2 and returns:
	A negative number if a1 should come before a2.
	Zero (0) if a1 and a2 are considered equal in order.
	A positive number if a1 should come after a2.

4. Sorting Process:
When you pass myComparator to Collections.sort(myArrayList, myComparator), the sorting algorithm (TimSort) repeatedly calls compare(o1, o2) behind the scenes on pairs of elements to determine their relative order.
Step-by-Step Example Trace
Let's look at the elements in your list: "Blue", "Red", "Yellow", "Orange".
String	Last Character	ASCII Value
"Blue"	'e'	101
"Red"	'd'	100
"Yellow"	'w'	119
"Orange"	'e'	101
	Comparing "Blue" ('e') vs "Red" ('d'): Character.compare('e', 'd') returns positive → "Red" comes before "Blue".
	Comparing "Blue" ('e') vs "Orange" ('e'): Character.compare('e', 'e') returns 0 → their relative positions remain intact.
	Comparing "Yellow" ('w') vs "Blue" ('e'): Character.compare('w', 'e') returns positive → "Yellow" goes to the back.

Final Sorted Output:

Plaintext

[Red, Blue, Orange, Yellow]
(Notice that "Red" ends in 'd', "Blue" and "Orange" end in 'e', and "Yellow" ends in 'w').




 */
