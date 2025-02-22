package Lambda.javaBrains;

public class HelloWorldGreeting implements Greeting{


    @Override
    public void perform() {
        System.out.println("hellow world from instance class");
    }
}
