package AbhinavSirLabWork.Oops;

import java.util.concurrent.Callable;

public class Lab423 {
    public static void main(String[] args) {
        B objq=new B();
        objq.m1();
        objq.m2();
        C ob3=new C();
        ob3.m3();
        ob3.m1();
    }
}
class A{
    public void m1(){
        System.out.println("A->m1()");
    }
}
class B extends A {
    public void m2(){
        System.out.println("B->m2()");
    }
}
class C extends A{
    public void m3(){
        System.out.println("C->m3()");
    }
}
