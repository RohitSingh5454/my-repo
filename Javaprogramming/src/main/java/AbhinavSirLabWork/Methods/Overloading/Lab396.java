package AbhinavSirLabWork.Methods.Overloading;

public class Lab396 {
    public static void main(String[] args) {
    int a=99;
        System.out.println("main begins "+a);
        Op ox=new Op();
        ox.m1(a);

    }
}
class Op{

    void m1(int a){
        System.out.println("m1() method");
        a=a+20;
    }
}