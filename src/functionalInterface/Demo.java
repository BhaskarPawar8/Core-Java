package functionalInterface;

@FunctionalInterface
interface A{
    public void show(int i);
}

public class Demo {

    public static void main(String[] args) {
        A obj = i ->
                System.out.println("In show .. " + i);

        A obj1 = i -> System.out.println(" in shw");

        obj.show(5);
    }

}
