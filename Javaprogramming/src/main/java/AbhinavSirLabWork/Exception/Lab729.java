package AbhinavSirLabWork.Exception;

public class Lab729 {
    public static void main(String[] args) {
        new Gpu().Nop("0");
        System.out.println("main ends");

    }
}
class Gpu{
    void Nop(String str){
        System.out.println("Nop method started");
        try {
            int x=Integer.parseInt(str);
            System.out.println(x);
            int y=10/x;
            System.out.println(y);
        }catch (ArithmeticException e){
            System.out.println("catch started");
            System.exit(0);
        }
        finally {
            System.out.println("finally block");

        }
    }
}
