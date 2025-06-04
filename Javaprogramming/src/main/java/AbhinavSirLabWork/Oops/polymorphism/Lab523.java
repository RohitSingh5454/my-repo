package AbhinavSirLabWork.Oops.polymorphism;

public class Lab523 {
    public static void main(String[] args) {
        A ob1=new B();
        ob1.a=67;
        System.out.println(ob1.a);
        System.out.println(ob1.a);
    }
}
class A{
    int a=98;
}
class B extends A{
    String a="Savita";
}
