package MorganStanley;

class A1 extends Thread{

    static int counter=0;
    public void  run(){

            counter = counter + 1;

    }
}



public class DemoStatic {

    public static void main(String[] args) throws InterruptedException {

        for(int a =0; a <=10; a++) {
            A1 obj1 = new A1();
            obj1.start();
            obj1.join();
        }


        System.out.println("value of counter post 10 threads: " + A1.counter);
    }

}
