package AbhinavSirLabWork.Constructor;

public class Lab331 {
    public static void main(String[] args) {
        Student obj1=new Student();
        obj1.name="Srinivas";
        obj1.id=76;
       // obj1.Show();
    }
}
class Student{
    int id;
    String name;
    Student(){
        System.out.println("This is default constructor");
    }
    void Show(){
        System.out.println(id+"\t"+name);
    }
}
