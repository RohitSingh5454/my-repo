package AbhinavSirLabWork.Oops.polymorphism;

public class Person {
    void eating(){
        System.out.println("Person->eating()");
    }
    void walking(){
        System.out.println("Person->walking()");
    }
    static void sleeping(){
        System.out.println("person->sleeping()");
    }
}
class EmployeesData extends Person{
    void walking(){
        System.out.println("EmployeesData->walking");
    }
    static void sleeping(){
        System.out.println("EmployeesData->Sleeping");
    }
    public void working(){
        System.out.println("EmployeesData->working()");
    }
}
class Student extends Person{
    void walking(){
        System.out.println("Student->Walking()");
    }
    static void sleeping(){
        System.out.println("Student->sleeping");
    }
    void reading(){
        System.out.println("Student->reading");
    }
}
class main{
    public static void main(String[] args) {
        Person p1=new Student();
        p1.eating();
        Person p2=new EmployeesData();
        EmployeesData emp=(EmployeesData) p2;
        emp.eating();
        p2.eating();
        p2.walking();
    }
}
