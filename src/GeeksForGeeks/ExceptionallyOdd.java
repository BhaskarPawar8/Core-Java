package GeeksForGeeks;

import java.util.HashMap;
import java.util.Map;

/*
Given an array of N positive integers where all numbers occur even number of times except one number which occurs odd number of times. Find the exceptional number.

        Example 1:

        Input:
        N = 7
        Arr[] = {1, 2, 3, 2, 3, 1, 3}
        Output: 3
        Explaination: 3 occurs three times.*/
public class ExceptionallyOdd {

    static int getOddOccurrence(int[] arr, int n) {

        HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            if(hashMap.containsKey(arr[i])){
                int freq = hashMap.get(arr[i]);
                freq++;
                hashMap.put(arr[i],freq);
            }
            else{
                hashMap.put(arr[i],1);
            }
        }

        for(Map.Entry<Integer,Integer> entry: hashMap.entrySet()){

            if(entry.getValue() == 1){
                return entry.getKey();
            }
            else{
                if(entry.getValue() % 2 !=0){
                    return entry.getKey();
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 2, 3, 1, 3};
        System.out.println(getOddOccurrence(arr,7));
    }
}
