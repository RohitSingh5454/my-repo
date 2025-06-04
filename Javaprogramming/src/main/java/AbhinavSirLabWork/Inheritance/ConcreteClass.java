package Inheritance;

public class ConcreteClass {
    public static void main(String[] args) {
     R r1=new R();
     r1.m3();
     //r1.m2();
     r1.m1();
     r1.m2();
    }
}
class P{
    void m1(){
        System.out.println("This is m1() method");
    }
}
class Q extends P{
   static int a=45;
    void m2(){
        System.out.println("This is m2() method");
    }
}
class R extends Q{
    void m3(){
        System.out.println("This is m3() method");
        System.out.println(super.a);
        System.out.println(Q.a);
    }

}
