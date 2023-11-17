package Companies.MS.uniqueObjects;

import java.util.*;

/*
Design a method which will take list of Employees and return the unique set of employees. Employee object has name and age as parameters.

        (See if you can use hashCode and equals methods of object)
*/

public class TestEmployeeUnique {

    public static Set<Employe> returnUniqueElements(List<Employe> employeList){

        Set<Employe> uniqueElements = new HashSet();
        if(Objects.nonNull(employeList)) {
            for(Employe em : employeList) {
                uniqueElements.add(em);
            }
            return uniqueElements;
        }
        return null;

    }
    public static void main(String[] args) {

        Set col = new HashSet<Integer>();
        col.add(21);
        col.add(9);
        col.add(82);

        Iterator it = col.iterator();
        System.out.println("Iterator: " + it.next());

        System.out.println("Collection: "+ col);

        Employe em1 = new Employe();
        em1.setName("abc");
        em1.setAge(10);

        Employe em2 = new Employe();
        em2.setName("pqr");
        em2.setAge(13);

        Employe em3 = new Employe();
        em3.setName("xyz");
        em3.setAge(10);

        Employe em4 = em3;

        List<Employe> employeeLits = Arrays.asList(em1,em2,em3, em4);

        System.out.println("Unique elements: " + returnUniqueElements(employeeLits));

    }
}
