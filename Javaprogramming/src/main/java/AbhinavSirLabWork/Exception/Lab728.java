package AbhinavSirLabWork.Exception;

public class Lab728 {
    public static void main(String[] args) {
        System.out.println("main started");
        new HelloSir().Show("2");
        System.out.println("main completed");
    }
}
class HelloSir{
    void Show(String str){
        System.out.println("show called method");
        try {
            System.out.println("try block started");
            int a=Integer.parseInt(str);
            int b=10/a;
            System.exit(23333);
            System.out.println("try block completed "+b);

        }catch (ArithmeticException e){
            System.out.println("Exception caught");
        }finally {
            System.out.println("finally block");
        }
    }
}
