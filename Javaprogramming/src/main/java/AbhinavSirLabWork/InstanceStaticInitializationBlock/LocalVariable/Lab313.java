package AbhinavSirLabWork.InstanceStaticInitializationBlock.LocalVariable;

public class Lab313 {
    public static void main(String[] args) {
       // System.out.println(Tac.b);
        Tac obk=new Tac();
        int b=87;
        b=44;

    }
}
class Tac{
         int a=76;
          // a=765;
           Tac(){
               int b=66;
               b=99;
           }
           public static void gfg(){
               int c=12;
               c=55;
           }
    static int b;

     static  {
       final int c=67;
       // System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}