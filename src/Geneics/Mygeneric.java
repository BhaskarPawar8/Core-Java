package Geneics;

public class Mygeneric<T> {

    public T vlaue;

    Mygeneric(T givenValue){
        this.vlaue = givenValue;
    }

    public void printValues(){
        System.out.println(vlaue);
    }

    public static void main(String[] args) {
        Mygeneric<Integer> myGenI = new Mygeneric<>(35);
        myGenI.printValues();

        Mygeneric<String> myGenS = new Mygeneric<>("Testing generics classes");
        myGenS.printValues();
    }
}
