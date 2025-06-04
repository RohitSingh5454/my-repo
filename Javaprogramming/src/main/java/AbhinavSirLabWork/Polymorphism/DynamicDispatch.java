package Polymorphism;

public class DynamicDispatch {
    public static void main(String[] args) {
        A obj1=new B();
        System.out.println(obj1.x);
        System.out.println(B.y);


    }
}
class A{
    int x=78;
}
class B extends A{
   static int y=78;
}
