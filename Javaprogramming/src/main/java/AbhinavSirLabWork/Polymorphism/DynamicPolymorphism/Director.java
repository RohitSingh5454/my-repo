package AbhinavSirLabWork.Polymorphism.DynamicPolymorphism;

public class Director {
    void walking(){
        System.out.println("Director walking");
    }
    void running(){
        System.out.println("Director running");
    }
    static void eating(){
        System.out.println("Director running");
    }
}
class Teacher extends Director{
    void walking(){
        System.out.println("Teacher walking");
    }
    void running(){
        System.out.println("Teacher running");
    }
     static void eating(){
        System.out.println("Teacher running");
    }
}
class Student extends Director{
    void walking(){
        System.out.println("Student walking");
    }
    void running(){
        System.out.println("Student running");
    }
    static void eating(){
        System.out.println("Student running");
    }

}
class mainLoading{
    public static void main(String[] args) {
        Director ob1=new Teacher();
        System.out.println("Printing using creating teacher object and assigning in director");
        ob1.running();
        ob1.walking();

        Director ob2=new Student();
        System.out.println("Printing using creating student object and assigning in director");
        ob2.walking();
        ob2.running();
    }

}
