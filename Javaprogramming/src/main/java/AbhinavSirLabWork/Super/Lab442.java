package AbhinavSirLabWork.Super;

public class Lab442 {
    public static void main(String[] args) {
    new Hello().show();
    }
}
class Hai{
    static int a=20;
}
class Hello extends Hai{
    static int a=30;
    public void show(){
        int a=40;
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);
    }
}
