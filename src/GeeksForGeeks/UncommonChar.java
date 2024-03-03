package GeeksForGeeks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/*
Given two strings A and B consisting of lowercase english characters. Find the characters that are not common in the two strings.

        Note :- Return the string in sorted order.

        Example 1:

        Input:
        A = geeksforgeeks
        B = geeksquiz
        Output: fioqruz
        Explanation:
        The characters 'f', 'i', 'o', 'q', 'r', 'u','z'
        are either present in A or B, but not in both.*/
public class UncommonChar {
    static String UncommonChars(String A, String B)
    {
        HashSet<Character> hashSet = new HashSet<Character>();

        for(int i=0;i<A.length();i++){
            hashSet.add(A.charAt(i));
        }

        for(int i=0;i<B.length();i++){
            if(hashSet.contains(B.charAt(i))){
                hashSet.remove(B.charAt(i));
            }
            else {
                hashSet.add(B.charAt(i));
            }
        }

        List<Character> arrayList = new ArrayList(hashSet);
        Collections.sort(arrayList);

        StringBuffer newString = new StringBuffer();
        for(Character cha : arrayList){
            newString.append(cha);
        }

        return newString.toString();
    }

    public static void main(String[] args) {
        System.out.println(UncommonChars("geeksforgeeks","geeksquiz"));
    }
}
