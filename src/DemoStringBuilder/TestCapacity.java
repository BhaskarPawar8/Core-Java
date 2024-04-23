package DemoStringBuilder;

public class TestCapacity {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        //insert
        StringBuilder sb1 = new StringBuilder("HellWorld");

        sb1.insert(4, "o ");
        System.out.println(sb1);// prints Hello World
        //capacity
        System.out.println(sb.capacity()); // default value 16

        sb.append("Java");
        System.out.println(sb.capacity()); // still 16

        sb.append("Hello StringBuilder Class!");
        System.out.println(sb.capacity()); // (16*2)+2 =34

        sb.append("hello world");
        System.out.println(sb);
        System.out.println(sb.capacity());

        //Reverse
        StringBuilder sbRev = new StringBuilder("wild");
        System.out.println(sbRev.reverse());
        // delet
        StringBuilder sbDel = new StringBuilder("Hello...  .world!");
        sbDel.delete(5, 7);
        System.out.println(sbDel.toString());// toString converts sbDel to string ,sbDel is of type StringBuilder
        String sbStr = sbDel.toString(); // new varibale of type String can take whats in toString so as to match type on both sides .
        System.out.println(sbStr);
        //replace
        StringBuilder sbRep = new StringBuilder("Hello Earth..!");
        sbRep.replace(6, 11, "world");
        System.out.println(sbRep);
        /*ensureCapacity(): The ensureCapacity() method of StringBuilder class ensures that the given capacity
         is the minimum to the current capacity. If it is greater than the current capacity, it increases the capacity by (old_capacity*2)+2 e.g. at current capacity 16, it becomes (16*2)+2 which is 34.
         */
        //EnsureCapacity
        // go through StringBuilder constructors empty= 16,charSequence =specified capcity +16 , string= specified capcity +16,intCapacity = int capacity
        //charSequence is interface


        StringBuilder sbEn = new StringBuilder("12345678");
        System.out.println(sbEn.capacity());// cap is 24
        sbEn.ensureCapacity(51);
        System.out.println(sbEn.capacity());


    }
}
