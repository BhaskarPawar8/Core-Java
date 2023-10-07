package Bhaskar.Static.Variables;

public class Cars {
    private String name;
    private String engine;

    static int numberofCars;

    Cars(String n, String e){
        name = n;
        engine = e;

        numberofCars ++;
    }

    public static void main(String[] args) {
        Cars cars1 = new Cars("Gerrrai", "C1");
        Cars cars2 = new Cars("Maserati", "G2");

        System.out.println("Number of cars : " + numberofCars);
    }

}
