package Bhaskar.Static.Classes;

public class Outer {
    private static String message = "Outer class message";

    public static class NestedStaticInner {

        public void printNestedStaticInner(){
            System.out.println("Message from nested static inner: " + message);
        }
    }

    public class InnerClass {
        public void printInnerCLass(){
            System.out.println("Message from Inner class : " + message);
        }
    }
}
