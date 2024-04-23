package demoOneDArray;

public class PrintArray {

    public static void main(String[] args) {
        printArray(new int[]{12, 20, 30, 40});
        printChar(new char[]{'A', 'C', 'E'});
        printFloat(new float[]{10f, 20f, 30f, 40f});
    }

    //creating a method which receives an array as a parameter
    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);

        for (int j : arr)
            System.out.println(j);
    }


    static void printChar(char arr1[]) {
        //  for (int j = 0; j < arr1.length; j++)
        //    System.out.print(arr1[j]+ " ");


        for (char c : arr1) {
            System.out.print(c + " ");
        }
    }


    static void printFloat(float arr2[]) {
        for (float f : arr2)
            System.out.println(f);
    }
}

//
