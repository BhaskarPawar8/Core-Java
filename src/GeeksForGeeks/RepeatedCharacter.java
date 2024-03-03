package GeeksForGeeks;

import java.util.HashSet;

/*Given a string consisting of lowercase english alphabets. Find the repeated character present first in the string.

        NOTE - If there are no repeating characters return '#'.

        Example 1:

        Input:
        S = "geeksforgeeks"
        Output: g
        Explanation: g, e, k and s are the repeating
        characters. Out of these, g occurs first.*/
public class RepeatedCharacter {
    static char firstRep(String S)
    {
        HashSet<Character> hashSet = new HashSet<Character>();
        for(int i=0;i<S.length();i++){
            if(hashSet.contains(S.charAt(i))){
                return S.charAt(i);
            }
            else{
                hashSet.add(S.charAt(i));
            }

        }
        return '#';
    }

    public static void main(String[] args) {
        System.out.println(firstRep("geeksforgeeks"));
    }
}
