package strings;

import org.w3c.dom.ls.LSOutput;

public class StringDemo {
    public static void main(String[] args) {

        float floatVar= 2222f;
        int  intVar=11;
        String stringVar= "I am using String class";
        int num = 1200000;

        String fs;
        fs = String.format("The value of the float variable is " +
                "%f, while the value of the integer " +
                "variable is %d, and the string " +
                "is %s", floatVar, intVar, stringVar);
        System.out.println(fs);
        System.out.println(fs + " " +num);



    }


}
