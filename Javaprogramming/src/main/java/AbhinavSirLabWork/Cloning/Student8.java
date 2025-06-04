package AbhinavSirLabWork.Cloning;

public class Student8{
    public static void main(String[] args) {
        Student9 obj1=new Student9();
        obj1.sname="Srinivas";
        Student9 obj2=obj1;
        obj2.sname="Dhande";
        System.out.println(obj1==obj2);
        System.out.println(obj1.equals(obj2));
    }
}
class Student9{
    String sname;
}
