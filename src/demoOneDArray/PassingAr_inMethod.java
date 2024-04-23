package demoOneDArray;

public class PassingAr_inMethod {

        //creating a method which receives an array as a parameter
        static void printArray(int arr[]){
            for(int i=0;i<arr.length;i++)
                System.out.print(arr[i]+"  ");
            System.out.println();
        }
        static void printCharArray(char arr1[]){
            for(int j=0;j<arr1.length;j++)
                System.out.println(arr1[j]);
        }

        public static void main(String args[]){
            printArray(new int[]{10,22,44,66});//passing anonymous array to method
            printCharArray(new char[]{'a','b','c'});//passing char array
        }

}
