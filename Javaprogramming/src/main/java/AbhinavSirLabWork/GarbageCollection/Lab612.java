package AbhinavSirLabWork.GarbageCollection;
class Hai{
    public void finalize(){
        System.out.println("hai----finalize");
    }

}
class Hello{
    void Show(){
        System.out.println("Hello------show()");
    }
    void m1(){
        System.out.println("m1----start");
        Hai h1=new Hai();
        Hai h2=new Hai();
        Hai h3=new Hai();
    }
    public void finalize(){
        System.out.println("Hello-----finalize");
    }
}
public class Lab612 {
    public static void main(String[] args) {
        new Hello().Show();
        Hello h1=new Hello();
        h1=null;
        Hello h2=new Hello();
        Hello h3=new Hello();
        h2=h3;
        new Hello().m1();
        System.gc();

    }
}
