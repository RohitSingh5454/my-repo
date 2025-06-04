package Super;

public class Demo {
    public static void main(String[] args) {
    B objY=new B();
    }
}
class A{
    int a=89;
    A(){
        System.out.println("This is Constructor A");
    }
}
class B extends A{

    B(){
        //super();
        System.out.println(a);
    }
}
