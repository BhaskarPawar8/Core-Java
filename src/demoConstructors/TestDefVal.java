package demoConstructors;

public class TestDefVal {

    int paraValue;
    String paraName;

    void display(){
        System.out.println(paraName+" "+paraValue);

    }


    public static void main(String[] args) {
        TestDefVal t1=new TestDefVal();
        TestDefVal t2=new TestDefVal();

        t1.display();
        t2.display();
    }
}
