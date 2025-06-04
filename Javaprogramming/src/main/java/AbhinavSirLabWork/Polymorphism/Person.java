package Polymorphism;

public class Person {
    void Walking(){
        System.out.println("Person->walking");
    }
    void Running(){
        System.out.println("Person->running");
    }
    void Sleeping(){
        System.out.println("Person->sleeping");
    }
}
 class EmployeesData extends Person{
    void Walking(){
        System.out.println("EmployeesData->walking");
    }
     void Running(){
         System.out.println("EmployeesData->running");
     }
     void Sleeping(){
         System.out.println("EmployeesData->sleeping");
     }
}
class Student extends EmployeesData{
    void Walking(){
        System.out.println("Student->walking");
    }
    void Running(){
        System.out.println("Student->running");
    }
    void Sleeping(){
        System.out.println("Student->sleeping");
    }
}
class Main{
    public static void main(String[] args) {
       /* Student s=new Student();
        Person p=null;
        p=new EmployeesData();
        p.Running();
        p.Sleeping();
        p.Walking();
        p=new Student();*/
        Person p=null;
        p=new Student();
        p.Walking();
        p.Running();
       EmployeesData e=(EmployeesData)p;
        //s.Running();
        e.Running();
    }
}
