package GeeksForGeeks;

/*Given two unsorted arrays A of size N and B of size M of distinct elements, the task is to find all pairs from both arrays whose sum is equal to X.

        Note: All pairs should be printed in increasing order of u. For eg. for two pairs (u1,v1) and (u2,v2), if u1 < u2 then
        (u1,v1) should be printed first else second.

        Example 1:

        Input:
        A[] = {1, 2, 4, 5, 7}
        B[] = {5, 6, 3, 4, 8}
        X = 9
        Output:
        1 8
        4 5
        5 4
        Explanation:
        (1, 8), (4, 5), (5, 4) are the
        pairs which sum to 9.
        Example 2:
        Input:
        A[] = {-1, -2, 4, -6, 5, 7}
        B[] = {6, 3, 4, 0}
        X = 8
        Output:
        4 4
        5 3*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class pair  {
    long first, second;
    public pair(long first, long second)
    {
        this.first = first;
        this.second = second;
    }
}
public class FindAllPairsWithGivenSum {

    static public pair[] allPairs( long A[], long B[], long N, long M, long X) {

        List<pair> mypairlist = new ArrayList<pair>();
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(A[i] + B[j] == X){
                    pair mypair = new pair(A[i],B[j]);
                    mypairlist.add(mypair);
                }
            }
        }

return null;
       // return mypairlist;
    }

    public static void main(String[] args) {
        long A[] = new long[]{1, 2, 4, 5, 7};
        long B[] = new long[]{5, 6, 3, 4, 8};

        allPairs(A,B,5,5,9);
    }


}
