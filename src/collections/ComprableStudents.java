package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{

    public int age;
    public String name;

    Student(int a, String n){
        age = a;
        name = n;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public int compareTo(Student thatstudent) {
        if(this.age > thatstudent.age)
            return 1;
        else
            return -1;
    }
}

public class ComprableStudents {
    public static void main(String[] args) {

        List<Student> suds = new ArrayList<Student>();

        Student sd1 = new Student(34,"Adam");
        Student sd2 = new Student(56,"Zend");
        Student sd3 = new Student(78,"Baberd");
        Student sd4 = new Student(98,"Atherton");

        suds.add(sd1);
        suds.add(sd2);
        suds.add(sd3);
        suds.add(sd4);

        Collections.sort(suds);

        System.out.println(suds);


    }
}
