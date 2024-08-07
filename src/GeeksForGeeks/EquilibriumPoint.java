package GeeksForGeeks;

/*Given an array A of n non negative numbers. The task is to find the first equilibrium point in an array. Equilibrium point in an array is an index (or position) such that the sum of all elements before that index is same as sum of elements after it.

        Note: Return equilibrium point in 1-based indexing. Return -1 if no such point exists.

        Example 1:

        Input:
        n = 5
        A[] = {1,3,5,2,2}
        Output:
        3
        Explanation:
        equilibrium point is at position 3 as sum of elements before it (1+3) = sum of elements after it (2+2).
        Example 2:

        Input:
        n = 1
        A[] = {1}
        Output:
        1
        Explanation:
        Since there's only element hence its only the equilibrium point.*/
public class EquilibriumPoint {

    public static int equilibriumPoint(long arr[], int n) {

        long totalSum =0;
        long leftSum =0;
        long rightSum =0;
        for(int i=0;i<n;i++){
            totalSum = totalSum + arr[i];
        }

        for(int i=0;i<n;i++){
            rightSum = totalSum - arr[i] - leftSum;
            if(leftSum == rightSum){
                return i+1;
            }
            leftSum = leftSum + arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        long[] a = new long[]{1,3,5,2,2};
        System.out.println(equilibriumPoint(a,5));
    }
}
