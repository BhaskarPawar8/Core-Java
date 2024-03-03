package Threading.WithThreadClass;

public class MultiThreadingThing extends Thread{

    private int threadId;
    MultiThreadingThing(int thId){
        this.threadId = thId;
    }

    @Override
    public void run(){
        for (int i =0; i < 5; i ++){
            System.out.println("Running from thread : " + threadId);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
