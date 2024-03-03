package GeeksForGeeks;
/*Given a String S, reverse the string without reversing its individual words. Words are separated by dots.
        Example 1:
        Input:
        S = i.like.this.program.very.much
        Output: much.very.program.this.like.i
        Explanation: After reversing the whole
        string(not individual words), the input
        string becomes
        much.very.program.this.like.i
        Example 2:

        Input:
        S = pqr.mno
        Output: mno.pqr
        Explanation: After reversing the whole
        string , the input string becomes
        mno.pqr*/
public class ReverseWordsString {
    static String reverseWords(String S)
    {
        String[] strArray = S.split("\\.");

        StringBuilder str = new StringBuilder();
        for(int i=strArray.length - 1;i>=0;i--){
            str.append(strArray[i]);
            if(i!=0) {
                str.append(".");
            }
        }

        return str.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("i.like.this.program.very.much"));
    }
}
