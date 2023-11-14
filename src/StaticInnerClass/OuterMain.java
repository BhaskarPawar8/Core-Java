package StaticInnerClass;

public class OuterMain {
    public static void main(String[] args) {

        Outer.NestedStaticInner nsi = new Outer.NestedStaticInner();
        nsi.printNestedStaticInner();



        // In order to create instance of
        // Inner class we need an Outer class
        // instance. Let us create Outer class
        // instance for creating
        // non-static nested class
        Outer outer = new Outer();
        Outer.InnerClass oi = outer.new InnerClass();

        oi.printInnerCLass();


        // We can also combine above steps in one
        // step to create instance of Inner class
        Outer.InnerClass innerObject
                = new Outer().new InnerClass();

        // Similarly we can now call Inner class method
        innerObject.printInnerCLass();


    }
}
