package Lambda.javaBrains.excercize;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Unit1ExcercizeJava8FunctionalInterface {

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
        printElementsBeingWithCondition(people, p -> true, p -> System.out.println(p));

        // step 3 -  create method tha prints all people with last name beginning with C.

        System.out.println("All elements with condition C");

        printElementsBeingWithCondition(people, p -> p.getLastName().startsWith("C"), p -> System.out.println(p));


        System.out.println("All elements with condition D");
        printElementsBeingWithCondition(people, p -> p.getLastName().startsWith("D"), p -> System.out.println(p));

    }

    private static void printElementsBeingWithCondition(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
        for(Person person : people){
            if(predicate.test(person)) {
                consumer.accept(person);
            }
        }
    }
}
