package AbhinavSirLabWork.InstanceStaticInitializationBlock;

public class Lab305 {
    public static void main(String[] args) {
       Joy ob1=new Joy();
       // System.out.println(Joy.a);
        System.out.println(Joy.a);

    }
}
class Joy{
    static  int a=10;
    {
        System.out.println("Instance block");
    }
    static {
        a=88;
        System.out.println("Static block :"+a);
    }
}
