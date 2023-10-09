package designPatterns.builder;

public class Main {
    public static void main(String[] args) {
        Pizza.Builder pizzBuilder = new Pizza.Builder("wheat", "thin").addCheese(true).addMushrooms(true).addPepporoni(true);

        Pizza pizza = new Pizza(pizzBuilder);

        System.out.println("Pizza object created: " + pizza.toString() );
    }
}
