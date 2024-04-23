package demoOneDArray;

public class testOneDArray {
    public static void main(String[] args) {
        int[] anArray = new int[5];
        int ArrayInt[] = {100, 200, 300, 400}; //this type of declaration is not commonly used
        //However, convention discourages this form; the brackets identify the array type and should appear with the type designation.

        anArray[0] = 10;// declaration  of array element
        anArray[1] = 20;
        anArray[2] = 30;
        anArray[3] = 40;
        anArray[4] = 50;
        //Another way of declaration of array

        int[] a;
        a = new int[4];
        a[0] = 1;
        a[1] = 2;
        a[2] = 1;
        a[3] = 2;

        for (int j : a) {
            System.out.println(j);
        }
        for (int i = 0; i < anArray.length; i++) {
            System.out.println("Here we see FOR loop to print array ");
            System.out.println("Array element " + i + " is " + anArray[i]);
        }

    }
}
