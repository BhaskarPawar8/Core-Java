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
public class MissingNumber {

    static int missingNumber(int array[], int n) {

        Arrays.sort(array);
        for(int i=0;i<array.length;i++){
            if(array[i] == i+1){
                continue;
            }
            else{
                return i+1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int A[] = new int[]{1};

        System.out.println("Result: "+ missingNumber(A,2));

    }
}
