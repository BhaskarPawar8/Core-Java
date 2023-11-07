package Oops;

class A{
    A(){
        System.out.println("Inside A constructor");
    }
    public void show(){
        System.out.println("In show");
    }
}

public class AnonymousObject {

    public static void main(String[] args) {
        new A().show(); // annonymnous object

    }

}
