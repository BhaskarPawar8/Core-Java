package GeeksForGeeks;

/*Given two arrays A and B of equal size N, the task is to find if given arrays are equal or not. Two arrays are said to be equal if both of them contain same set of elements, arrangements (or permutation) of elements may be different though.
        Note : If there are repetitions, then counts of repeated elements must also be same for two array to be equal.

        Example 1:

        Input:
        N = 5
        A[] = {1,2,5,4,0}
        B[] = {2,4,5,0,1}
        Output: 1
        Explanation: Both the array can be
        rearranged to {0,1,2,4,5}*/

import java.util.HashMap;
import java.util.Map;

public class CheckArraysEquals {

    public static boolean check(long A[],long B[],int N) {
        HashMap<Long, Integer> hashMap = new HashMap<Long, Integer>();

        for (int i = 0; i < N; i++) {
            long num = A[i];

            if (hashMap.containsKey(num)) {
                int freq = hashMap.get(num);
                freq++;
                hashMap.put(num, freq);
            } else {
                hashMap.put(num, 1);
            }
        }

        for (int i = 0; i < N; i++) {
            long num = B[i];

            if (hashMap.containsKey(num)) {
                int freq = hashMap.get(num);
                freq--;
                hashMap.put(num, freq);
            } else {
                hashMap.put(num, -1);
            }
        }

        for (Map.Entry<Long, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        long[] A = new long[]{1,2,5};
        long[] B = new long[]{2,4,15};
        System.out.println(check(A,B,A.length));
    }

}
