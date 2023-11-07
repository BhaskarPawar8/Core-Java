package MorganStanley;

import java.util.*;
class Employee{
    public String name;
    public int age;

    Employee(String n, int a){
        name = n;
        age = a;
    }

}


public class UniqueEmployees {

    public Set<Employee> returnUniqueEmployees(List<Employee> inputEmployee) {

        Set<Employee> uniqueSetEmployees = new HashSet<Employee>();

        for(Employee e : inputEmployee){
            for(Employee j : inputEmployee){
                if(e == j){
                    continue;
                }
                else{
                 if(e.hashCode() == j.hashCode()){
                     break;
                 }
                }
            }
            uniqueSetEmployees.add(e);
            // todo not complete logic
        }
        return uniqueSetEmployees;
    }

        public static void main(String[] args) {

            Employee e1 = new Employee("Ajay",10);
            Employee e2 = new Employee("Vijay",20);
            Employee e3 = new Employee("Ramesh",30);

            List<Employee> input = Arrays.asList(e1,e2,e3);

            UniqueEmployees ue = new UniqueEmployees();

            Set<Employee> returnedUniqueElements = ue. returnUniqueEmployees(input);

            System.out.println("Unique elements: " + returnedUniqueElements);
    }
}
