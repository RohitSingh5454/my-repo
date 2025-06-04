package AbhinavSirLabWork.ObjectClass;

public class Lab600 {
    public static void main(String[] args) {
     showClassInfo(new Person());
     showClassInfo(new Student());
    }
    public static void showClassInfo(Object obj){
        Class cls=obj.getClass();
        System.out.println("class name "+cls.getName());
        Class clrs=cls.getSuperclass();
        if (clrs!=null){
            System.out.println("Parent class name is "+clrs.getName());
        }
        else {
            System.out.println("No parent class is present");
        }
    }
}
class Person{

}
class Student extends Person{

}
