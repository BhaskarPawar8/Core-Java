package Scope;

public class ClassScopeExample {
    private static Integer amount = 0;

    public void exampleMethod() {
        amount++;
    }

    public void anotherExampleMethod() {
        Integer anotherAmount = amount + 4;
    }

    public static void main(String[] args) {
        ClassScopeExample classScopeExample = new ClassScopeExample();

        classScopeExample.exampleMethod();
        classScopeExample.anotherExampleMethod();

        System.out.println("Value of amount: "+ amount);

    }
}
