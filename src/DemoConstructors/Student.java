package DemoConstructors;

public class Student {

    int id;
    String name;
    int age;
    Student(int i,String p){
        id=i;
        name=p;
    }
    Student(int i,String p,int j){
        id=i;
        name=p;
        age=j;
    }
    void display(){
        System.out.println(id+ " "+name+ " "+age);
    }
    public static void main(String[] args) {
        Student s1=new Student(11,"name1");
        Student s2=new Student(12,"name2",23);
        s2.display();
        s1.display();
        System.out.println(s1.age);


    }
}
