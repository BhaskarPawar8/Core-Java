package Threads;

class A extends Thread{

    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("HI");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class B extends Thread{
    public void run() {

        for(int i=0;i<100;i++){
            System.out.println("Hello");
        }
    }
}

public class Demo {

    public static void main(String[] args) {

        A obj1 = new A();
        B obj2 = new B();

    //    obj2.setPriority(Thread.MAX_PRIORITY);

        obj1.start();
        obj2.start();
    }

}
