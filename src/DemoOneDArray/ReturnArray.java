package DemoOneDArray;
import java.util.Arrays;

public class ReturnArray {

           public static void main(String args[])
        {
            int[] getArray = writeArray();           //obtain the array
            for (int i = 0; i < getArray.length; i++) //for loop to print the array
                System.out.print(getArray[i]+ " ");
        }
        public static int[] writeArray()
        {
            int[] b={90};
            int[] arr={5,6,7,8,9};  //initializing array
            return arr;
        }

}
