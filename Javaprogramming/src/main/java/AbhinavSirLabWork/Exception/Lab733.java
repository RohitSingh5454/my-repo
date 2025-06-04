package AbhinavSirLabWork.Exception;

public class Lab733 {
    public static void main(String[] args) {
        Exception ex1=new ArithmeticException();
        Exception ex2=new ClassNotFoundException();
        System.out.println(ex1 instanceof RuntimeException);
        System.out.println(ex2 instanceof RuntimeException);
    }
}
