package Lambda.javaBrains.excercize;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Unit1ExcercizeJava8 {

    public static void main(String[] args) {

        // step 1 - sort list by last name
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Caroll", 42),
                new Person("Thomas", "Carlayle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnols", 39)
        );

        Collections.sort(people, (p1, p2) ->  p1.getLastName().compareTo(p2.getLastName()));


        System.out.println("All elements");
        // step 2 - create method to print to all elements in list
        printElementsBeingWithCondition(people, p -> true);

        // step 3 -  create method tha prints all people with last name beginning with C.

        System.out.println("All elements with condition C");

        printElementsBeingWithCondition(people, p -> p.getLastName().startsWith("C"));


        System.out.println("All elements with condition D");
        printElementsBeingWithCondition(people, p -> p.getLastName().startsWith("D"));

    }

    private static void printElementsBeingWithCondition(List<Person> people, Condition condition) {
        for(Person person : people){
            if(condition.test(person)) {
                System.out.println(person);
            }
        }
    }
}
