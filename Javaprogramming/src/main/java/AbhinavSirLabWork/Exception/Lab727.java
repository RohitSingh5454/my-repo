package AbhinavSirLabWork.Exception;

public class Lab727 {
    public static void main(String[] args) {
        int c=new Gear().how();
        System.out.println("result is : "+c);
        System.out.println("main ends");

    }
}
class Gear{
    int how(){
        int x=0;
        try {
            System.out.println("try block starts : "+x);
            x=10/5;
            System.out.println("try block ends : "+x);
        }catch (ArithmeticException e){
            x=20;
            System.out.println("catch block : "+x);;
        }
        finally {
            x=30;
            System.out.println("finally block starts : "+x);
            int arr[]=new int[-1];
        }

        return x;
    }
}
