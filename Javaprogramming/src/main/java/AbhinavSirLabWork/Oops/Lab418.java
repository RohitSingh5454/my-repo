package AbhinavSirLabWork.Oops;

public class Lab418 {
    public static void main(String[] args) {
        Hai ob1=new Hai();
        System.out.println(ob1.a);
       //
        // System.out.println(ob1.b);
        Hello ob2=new Hello();
        System.out.println(ob2.a);
        System.out.println(ob2.b);
    }
}
class Hai{
    int a=99;
}
class Hello extends Hai{
    int b=77;
}
