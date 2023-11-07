package Threads;

class Sample{

    int counter;
    public void incrementCount(){
        counter++;
    }

}

public class ThreadsDemo{
    public static void main(String[] args){

        Sample s1 = new Sample();

        Runnable runnable1 = () -> {
                for(int i=1; i <= 1000; i++){
                    s1.incrementCount();
                }
        };

        Runnable runnable2 = () -> {
            for(int i=1; i <= 1000; i++){
                s1.incrementCount();
            }
        };

        Thread t1 = new Thread(runnable1);
        Thread t2 = new Thread(runnable2);

        t1.start();
        t2.start();

       // s1.incrementCount();

        System.out.println(s1.counter);

    }

}
