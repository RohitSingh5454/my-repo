package AbhinavSirLabWork.InstanceStaticInitializationBlock.LocalVariable;

public class Lab311 {
    public static void main(String[] args) {
       Wx d=new Wx();
      // Wx obj2=new Wx();
    }
}
class Wx{
   int a=20;
    static int b=30;
    int c=40;
    {
       // int c=40;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}