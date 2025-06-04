package AbhinavSirLabWork.Oops;

public class Lab422 {
    public static void main(String[] args) {
        Lion ob1=new Lion();
        ob1.m1();
        ob1.m2();
        ob1.m3();
    }
}
class Animal{
    public void m1(){
        System.out.println("Animal->m1()");
    }
}
class Goat extends Animal{
    public void m2(){
        System.out.println("Goat->m2()");
    }
}
class Lion extends Goat{
    public void m3(){
        System.out.println("Lion->m3()");
    }
}
