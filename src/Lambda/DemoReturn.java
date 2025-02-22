package Lambda;

@FunctionalInterface
interface Ademo{
    int add1(int i,int j);
}

public class DemoReturn {

    public static void main(String[] args) {

        Ademo obj = ( i, j) ->   i+j;

        int result = obj.add1(5,4);
        System.out.println("Addition: " + result);

    }

}
