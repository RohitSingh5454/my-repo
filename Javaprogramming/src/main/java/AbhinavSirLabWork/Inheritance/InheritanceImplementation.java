package Inheritance;

public class InheritanceImplementation {
    public static void main(String[] args) {
        A obj1=new A();
        B obj2=new B();
        System.out.println(obj2.b);
        System.out.println(obj1.a);


    }}

    class A {
        int a=78;
    }
    class B extends A {
        int b=54;
    }
