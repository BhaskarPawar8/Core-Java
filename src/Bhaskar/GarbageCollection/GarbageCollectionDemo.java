package Bhaskar.GarbageCollection;

public class GarbageCollectionDemo {

    public static void main(String[] args) {
        SampleClass sampleClass = new SampleClass();

        sampleClass = null;

        System.gc();

        System.out.println("System is running");
    }
}
