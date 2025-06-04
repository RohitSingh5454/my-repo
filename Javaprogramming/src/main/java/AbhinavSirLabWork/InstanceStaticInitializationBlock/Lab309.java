package AbhinavSirLabWork.InstanceStaticInitializationBlock;

public class Lab309 {
    public static void main(String[] args) {
        System.out.println("main block");

    }
    static {
        System.out.println("static main block");
    }
}
class Xyz{
    static int a;
    int b;
    static {
        a=77;
        //b=45;
    }
}
