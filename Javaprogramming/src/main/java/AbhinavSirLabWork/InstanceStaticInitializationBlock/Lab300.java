package AbhinavSirLabWork.InstanceStaticInitializationBlock;

public class Lab300 {
    public static void main(String[] args) {
      // Bp ox=new Bp();


       System.out.println(Bp.a);
    }
}
class Bp{
   static int a;
   static  {
        a=10;
        System.out.println("Initialized : "+a);
    }


   // a=89;
}
