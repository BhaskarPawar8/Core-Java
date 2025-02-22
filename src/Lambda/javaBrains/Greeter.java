package Lambda.javaBrains;

public class Greeter {
    public void greet(Greeting greeting){
        greeting.perform();
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();

        Greeting hellowWorldGreeting = new HelloWorldGreeting();


        Greeting mylambdafun = () -> System.out.println("hellow world from lambda");

        Greeting greetingInnerclass = new Greeting() {
            @Override
            public void perform() {
                System.out.println("Hello world inner class");
            }
        };

        greeter.greet(mylambdafun);
        greeter.greet(greetingInnerclass);
        greeter.greet(hellowWorldGreeting);

    }
}