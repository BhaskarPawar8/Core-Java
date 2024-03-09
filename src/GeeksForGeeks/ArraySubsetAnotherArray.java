package GeeksForGeeks;

import java.util.HashMap;

/*
Given two arrays: a1[0..n-1] of size n and a2[0..m-1] of size m, where both arrays may contain duplicate elements. The task is to determine whether array a2 is a subset of array a1. It's important to note that both arrays can be sorted or unsorted. Additionally, each occurrence of a duplicate element within an array is considered as a separate element of the set.

        Example 1:

        Input:
        a1[] = {11, 7, 1, 13, 21, 3, 7, 3}
        a2[] = {11, 3, 7, 1, 7}
        Output:
        Yes
        Explanation:
        a2[] is a subset of a1[]

        Example 2:

        Input:
        a1[] = {1, 2, 3, 4, 4, 5, 6}
        a2[] = {1, 2, 4}
        Output:
        Yes
        Explanation:
        a2[] is a subset of a1[]*/
public class ArraySubsetAnotherArray {

    static public String isSubset( long a1[], long a2[], long n, long m) {

        if(a2.length > a1.length){
            return "No";
        }

        HashMap<Long,Integer> hashMap = new HashMap<Long,Integer>();

        for(int i=0;i<m;i++){
            if(hashMap.containsKey(a2[i])){
                int freq = hashMap.get(a2[i]);
                freq = freq + 1;
                hashMap.put(a2[i],freq);
            }
            else{
                hashMap.put(a2[i],1);
            }
        }

        for(int j=0;j<n;j++){
            if(hashMap.containsKey(a1[j])){
                int freq = hashMap.get(a1[j]);
                freq = freq - 1;
                hashMap.put(a1[j],freq);
            }
        }

        for(Integer it: hashMap.values()){
            if(it > 0){
                return "No";
            }
        }
        return "Yes";
    }

    public static void main(String[] args) {
        long a1[] = new long[]{1 ,2 ,3 ,4 ,5 ,1 ,1 ,1};
        long a2[] = new long[]{1 ,2 ,3 ,1};

        System.out.println(isSubset(a1,a2,8,4));
    }
}
