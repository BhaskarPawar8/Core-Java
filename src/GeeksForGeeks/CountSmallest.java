package GeeksForGeeks;

public class CountSmallest {
    public static int countOfElements(int []arr,int n,int x)
    {
        int count =0;
        for(int i=0; i<n;i++){
            if(arr[i] <= x) {
                count = count + 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        // Given an sorted array A of size N. Find number of elements which are less than or equal to given element X.

        int[] inputArr = {1, 2, 4, 5, 8, 10};
        int x = 7;
        System.out.println(countOfElements(inputArr, inputArr.length, x));
    }

}
