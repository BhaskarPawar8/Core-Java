package strings;
/**
The method compareTo() is used for comparing two strings lexicographically in Java.
        ...
        It returns the following values:
        if (string1 > string2) it returns a positive value.
        if both the strings are equal lexicographically. i.e.(string1 == string2) it returns 0.
        if (string1 < string2) it returns a negative value.
**/
public class TestStringCompareTo {
    public static void main(String[] args) {
        String str1 = "Strings are immutable";
        String str2 = new String("Strings are immutable");
        String str3 = new String("Integers are not  immutable");
        String str4 = new String("I am using string compare to object");

        int result = str1.compareTo( str2 );
        System.out.println(result);

        result = str2.compareTo( str3 );
        System.out.println(result);


        int result2 =str3.compareTo(str4);
        System.out.println(result2);
    }
    }

