package Companies.Apexon;
/*

Two words are said to be anagrams if each character occurs the same number of times in both words.

Given an array of strings, group anagrams together. All the input strings are in Lowercase.

Example:

Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
Input: ["aet", "aet", "ant", "aet", "ant", "abt"],
Output:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]

eaat, teea

*/

import java.util.*;

public class Solution {

    public static List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> finalListofList = new ArrayList<List<String>>();

        for(int i=0; i<strs.length;i++){
            char[] charArrayFirstString = strs[i].toCharArray();
            for(int j=0; j<strs.length;j++){
                if(i == j){
                    continue;
                }
                char[] charArraySecondString = strs[j].toCharArray();
                if(isAnagram(charArrayFirstString,charArraySecondString)){
                    if(finalListofList.isEmpty()){
                        List<String> firstList = new ArrayList<>();
                        firstList.add(charArrayFirstString.toString());
                        finalListofList.add(firstList);
                    }
                    else{
                        for(List<String> list : finalListofList){
                            if(list.contains(charArraySecondString)){
                                list.add(charArraySecondString.toString());
                            }
                        }
                    }
                }
                else{

                }

            }
        }

        List<String> sortedStringList = new ArrayList<>();
        sortedStringList.add(strs[0]);

        char[] charArrayFirstString = strs[0].toCharArray();
        Arrays.sort(charArrayFirstString);

        for(int i=1; i<strs.length;i++){
            char[] currentCharArray = strs[i].toCharArray();
            Arrays.sort(currentCharArray);

        }
        // Your code here
        return new ArrayList<>();
    }

    public static boolean isAnagram(char[] first, char[] second){
        if(first.length != second.length){
            return false;
        }
        Arrays.sort(first);
        Arrays.sort(second);

        for(int i=0;i< first.length;i++){
            if(first[i] != second[i]){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        Solution.groupAnagrams(strs);
    }

}
