package Oops.superKey;

class A{

    A(){
        System.out.println("in A defalut constructor");
    }

}

class B extends A{
    B(){
        System.out.println("in B defalut constructor");
    }
    B(int i){
        super(); // All constructor's have a super keyword by default.
        System.out.println("in B parameters constructor");
    }

}

public class Demo {
    public static void main(String[] args) {
        B b = new B(5);
    }
}
