package Inheritance;

public class UsingFinal {
    public static void main(String[] args) {
        A1 obj1 = new A1();
        B1 obj2 = new B1();

        obj1.m1();
        obj2.m2();

    }
}
class A1{
    void m1(){
        System.out.println("This is m1() method");
    }
}
final class B1 extends A1{
    void m2(){
        System.out.println("This is m2() method");
    }
}


