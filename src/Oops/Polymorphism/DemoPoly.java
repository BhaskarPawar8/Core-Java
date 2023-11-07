package Oops.Polymorphism;

class A{

    public void show(){
        System.out.println("in A show");
    }
}

class B extends A{
    public void show() {
        System.out.println("In B show");
    }
}
public class DemoPoly {

    public static void main(String[] args) {
        A b = new B(); // This is polymophism
        b.show();

        B b1 = new B();
        b1.show();

    }
}
