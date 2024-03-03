package GeeksForGeeks;

import java.util.ArrayList;

public class ReverseArray {
    //Function to reverse every sub-array group of size k.
    static void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        for(int x=0;x<n;x=x+k){
            reverse(arr,x+k-1,x);
        }
    }

    static void reverse(ArrayList<Integer> arr, int lastIndex, int firstIndex){

        int temp=0;
        for(int i=lastIndex;i>firstIndex;i--){
            temp = arr.get(firstIndex);
            arr.set(firstIndex, arr.get(i));
            arr.set(i, temp);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        reverseInGroups(arrayList,5,3);

    }

}
