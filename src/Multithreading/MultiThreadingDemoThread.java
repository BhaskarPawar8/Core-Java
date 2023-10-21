package Multithreading;

public class MultiThreadingDemoThread extends Thread{

    public void run(){
        System.out.println("Object: " + Thread.currentThread().getId());
    }

    public static void main(String[] args) {


        int i =8; // number of threads
        for (int a=0;a<i;a++){
            Thread myObjects = new MultiThreadingDemoThread();
            myObjects.start();
        }


    }
}
