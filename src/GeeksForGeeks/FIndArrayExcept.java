package GeeksForGeeks;

import java.util.Arrays;

public class FIndArrayExcept {

    public static long[] findElements( long a[], long n)
    {
        int maxIndex =0;
        for(int i=0;i<n-1;i++){
            if(a[maxIndex] < a[i+1]){
                maxIndex = i+1;
            }
        }

        long newArray[] = new long[a.length - 1];

        for(int i=0,k=0;i<a.length;i++){
            if(i == maxIndex){
                continue;
            }
            newArray[k++] = a[i];
        }

        maxIndex =0;
        for(int i=0;i<n-1;i++){
            if(a[maxIndex] < a[i+1]){
                maxIndex = i+1;
            }
        }

        long newArray2[] = new long[newArray.length - 1];

        for(int i=0,k=0;i<newArray.length;i++){
            if(i == maxIndex){
                continue;
            }
            newArray2[k++] = newArray[i];
        }

        Arrays.sort(newArray2);

        for(int i=0;i<newArray2.length;i++){
            System.out.print(newArray2[i] + " ");
        }
        return newArray2;

    }

    public static void main(String[] args) {

        long a[] = {2, 8, 7, 1, 5};
        findElements(a,5);
    }
}
