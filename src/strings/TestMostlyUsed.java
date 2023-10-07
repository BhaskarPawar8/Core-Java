package strings;

public class TestMostlyUsed {
    public static void main(String[] args) {
//HOW TO USE public String replace(char old, char new)

        String s= "abababab";
        System.out.println(s);
        System.out.println(s.replace('a','O'));

//HOW TO USE public String substring(int begin)/ public String substring(int begin, int end)

        String x = "0123456789";
        System.out.println( x.substring(4) );
        System.out.println( x.substring(3, 8));
// HOW TO USE public String toLowerCase()
        String a= "I have a new  BOOK";
        System.out.println(a.toLowerCase());
//HOW TO USE public String to uppercase()

        String b = "A New Java Book";
        System.out.println( b.toUpperCase() ); //

//HOW TO uSE public String trim()
    String t = "Hello doc   ";
        System.out.println(t +  "tor");
        System.out.println(t.trim()+"tor");
//HOW TO USE public char[ ] toCharArray( )
        String c ="exam";
        char [] arrayChar = c.toCharArray();
        System.out.println(arrayChar[1]);

 //HOW TO USE public boolean contains(“searchString”)
      String search ="this contains java code";
        System.out.println(search.contains("code"));
        System.out.println(search.contains("ram"));
    }


}
