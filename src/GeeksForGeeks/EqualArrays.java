package GeeksForGeeks;

import java.util.Arrays;

public class EqualArrays {

    public static boolean check(long A[],long B[],int N)
    {
        Arrays.sort(A);
        Arrays.sort(B);

        for(int i=0;i<N;i++){
               if(A[i] == B[i]){
                    continue;
                }
                else
                    return false;
        }
        return true;
    }

    public static void main(String[] args) {
        long A[] = new long[]{8,9,7,5,3,1};
        long B[] = new long[]{5,4,2,5,1,7};

        System.out.println("Result: "+ check(A,B,5));

    }
}
