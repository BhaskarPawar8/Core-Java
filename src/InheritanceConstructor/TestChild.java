package InheritanceConstructor;

public class TestChild extends TestParent{

    TestChild(){
        //super(); // Every constructor calls parent's default constructor by default
        System.out.println("Default child constructor");
    }
    TestChild(String abc, String pgr){
        super(abc,pgr); // Every constructor calls parent's default constructor by default, unless specifically by using super keyword
        System.out.println("Parametrised child constructor");
    }

    public static void main(String[] args) {
        TestChild defaultParent = new TestChild();
        TestChild paramParent = new TestChild("abc","pqr");
    }

}
