package GeeksForGeeks;

public class ReverseString {

    public static String reverseWord(String str)
    {
        char[] charArr = str.toCharArray();
        StringBuffer newStr=new StringBuffer();
        for(int i=charArr.length -1;i>=0;i--){
            newStr.append(charArr[i]);
        }
        return newStr.toString();
    }

    public static void main(String[] args) {
        System.out.println("Reversed word: "+ reverseWord("Geeks"));
    }
}
