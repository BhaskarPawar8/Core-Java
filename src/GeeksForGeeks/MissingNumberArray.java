package GeeksForGeeks;

import java.util.Arrays;

/*Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. Find the missing element.

        Example 1:

        Input:
        N = 5
        A[] = {1,2,3,5}
        Output: 4
        Example 2:

        Input:
        N = 10
        A[] = {6,1,2,8,3,4,7,10,5}
        Output: 9*/
public class MissingNumberArray {

    static int missingNumber(int array[], int n) {

        int xor1 = 0;
        int xor2 = 0;
        for(int i = 0; i < n-1; i++) {
            xor1 = xor1^(i+1);
            xor2 = xor2^(array[i]);
        }
        xor1 = xor1^n;
        return xor1^xor2;
    }

    public static void main(String[] args) {
        int A[] = new int[]{6,1,2,8,3,4,7,10,5};

        System.out.println("Result: "+ missingNumber(A,10));

    }
}
