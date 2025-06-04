package Inheritance;

public class InheritanceStaticUse {
    public static void main(String[] args) {
       BC obj1 = new BC();
       CD obj2 = new CD();
        System.out.println(PQ.p);
    }
}
class BC{
    int a=56;
    {
        System.out.println("This is m1() method : "+a );
    }
}
class CD extends BC{
     static int b=78;
    {
        System.out.println("This is m3() method : "+a+" : "+b);
    }
}
class XY {
    static int p=89;
    static {
        System.out.println("This is static block");
    }
}
class PQ extends XY{

    static {
        System.out.println("This is another static block");
    }
}
