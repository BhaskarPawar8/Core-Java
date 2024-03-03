package Threading.newThread;

public class Demo {

    public static void main(String[] args) {
        Mytask mytask1 = new Mytask("Thrd1");
        Mytask mytask2 = new Mytask("Thrd2");

        mytask1.run();
        mytask2.run();
    }
}
