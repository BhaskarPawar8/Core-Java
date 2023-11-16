package functionalInterface;

@FunctionalInterface
interface Ademo{
    public int add1(int i,int j);
}

public class DemoReturn {

    public static void main(String[] args) {

        Ademo obj = ( i, j) ->   i+j;

        Ademo obj1 = (i, j) ->  i + j;

        int result = obj.add1(5,4);
        System.out.println("Addition: " + result);

    }

}
