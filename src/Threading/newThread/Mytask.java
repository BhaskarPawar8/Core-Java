package Threading.newThread;

public class Mytask extends Thread{

    private String name;
    public Mytask(String n) {
        name = n;
    }

    @Override
    public void run() {
        for(int i=0; i < 5;i++){
            try {
                System.out.println("Sleeping 1 sec for thread: " + name);
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
