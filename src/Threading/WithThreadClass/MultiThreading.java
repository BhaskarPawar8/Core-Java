package Threading.WithThreadClass;

public class MultiThreading {
    public static void main(String[] args) {
        int i = 5; // number of threads

        for (int a = 0; a < i; a++) {
            Thread myObjects = new MultiThreadingThing(a);
            myObjects.start();
        }
    }
}
