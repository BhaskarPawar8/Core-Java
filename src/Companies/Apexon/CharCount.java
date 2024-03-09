package Companies.Apexon;
/*
Character Frequency Count
Given an input string S, output a string containing each character and its frequency in the given string S.

Example:
Input string : "aaaabbcddee"
Output string : "a4b2c1d2e2"


Input string : "aaba"
Output string : "a3b1"

*/

/* Ensure the solution caters for strings where the characters can be repeated later in the string */

import java.util.*;

public class CharCount {

    public static String charFreqCount(String inputStr) {


        char[] charArray = inputStr.toCharArray();
        Map<Character,Integer> hashMap = new HashMap<Character,Integer>();

        for(int i=0; i< charArray.length; i++){
            if(hashMap.containsKey(charArray[i])){
                int freq = (Integer) hashMap.get(charArray[i]);
                freq = freq + 1 ;
                hashMap.put(charArray[i], freq);
            }
            else{
                hashMap.put(charArray[i], 1);
            }
        }

        StringBuilder result = new StringBuilder();
        for(Character charEntry : hashMap.keySet()){
            result.append(charEntry);
            result.append(hashMap.get(charEntry));
        }

        // Your code here
        return result.toString();
    }

    // you can change anything
    public static void main(String[] args) {
        charFreqCount("aaaabbcddee");
    }

}

