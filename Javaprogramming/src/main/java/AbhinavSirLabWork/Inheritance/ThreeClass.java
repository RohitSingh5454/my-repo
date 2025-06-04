package Inheritance;

public class ThreeClass {
    public static void main(String[] args) {
        X obj1 = new X();
        Y obj2 =new Y();
        obj1.m1();
        obj2.m2();
        Z obj3=new Z();
        obj3.m3();

    }
}
class X{
    int a=78;
   void m1(){
       System.out.println("This is m1() method: "+a);
   }

}
class Y extends X{
    int b=67;
    void m2(){
        System.out.println("This is m2() method : "+a+" : "+b);
    }

}
class Z extends Y{
    int c=91;
    void m3(){
        System.out.println("This is m3() method : "+a+" :"+b+" :"+c);
    }
}
