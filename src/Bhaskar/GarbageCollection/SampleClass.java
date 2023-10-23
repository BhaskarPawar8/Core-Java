package Bhaskar.GarbageCollection;

public class SampleClass {

    public SampleClass(){
        System.out.println("Object is created");
    }

    @Override
    public void finalize(){
        System.out.println("Calling Finalise of Object");
    }
}
