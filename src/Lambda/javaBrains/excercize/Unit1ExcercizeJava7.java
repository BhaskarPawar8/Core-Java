package Lambda.javaBrains.excercize;

import java.util.*;

public class Unit1ExcercizeJava7 {

    public static void main(String[] args) {

        // step 1 - sort list by last name



        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Caroll", 42),
                new Person("Thomas", "Carlayle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnols", 39)
        );

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });

        System.out.println("All elements");
        // step 2 - create method to print to all elements in list
        printAllElements(people);

        // step 3 -  create method tha prints all people with last name beginning with C.

        System.out.println("All elements with condition C");

        printElementsBeingWithCondition(people, new Condition(){

            @Override
            public boolean test(Person person) {
                return person.getLastName().startsWith("C");
            }
        } );

        System.out.println("All elements with condition D");
        printElementsBeingWithCondition(people, new Condition(){

            @Override
            public boolean test(Person person) {
                return person.getLastName().startsWith("D");
            }
        } );

    }

    private static void printElementsBeingWithCondition(List<Person> people, Condition condition) {
        for(Person person : people){
            if(condition.test(person)) {
                System.out.println(person);
            }
        }
    }

    private static void printAllElements(List<Person> people) {
        for(Person person : people){
            System.out.println(person);
        }
    }
}

