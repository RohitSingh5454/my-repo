package AbhinavSirLabWork.Exception;

public class Lab725 {
    public static void main(String[] args) {
      int po=new Hero().how();
        System.out.println("Result is : "+po);
        System.out.println("main ends");
    }
}
class Hero{
    int how(){
        int a=0;
        try {
            System.out.println("try block starts : "+a);
           a=10/4;
            System.out.println("try block ends : "+a);
           // return a;
        }catch (ArithmeticException e){
            a=30;
            System.out.println("catch block : "+a);
           // return a;
        }
        finally {
            System.out.println("finally value is : "+a);
            a=40;
            System.out.println("finally ends : "+a);
            //return a;
        }
        return a;
    }
}
