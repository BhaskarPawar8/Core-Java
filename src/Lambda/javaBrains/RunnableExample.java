package Lambda.javaBrains;

public class RunnableExample {
    public static void main(String[] args) {

        Thread myThread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Running thread from runnable interface");
            }
        });

        myThread1.run();

        Thread myThread2 = new Thread(() -> System.out.println("Running from lambda"));
        myThread2.run();

    }

}
