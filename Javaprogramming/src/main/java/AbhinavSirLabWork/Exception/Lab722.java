package AbhinavSirLabWork.Exception;

public class Lab722 {
    public static void main(String[] args) {
        try {
            int x=10/3;
            System.out.println(x);
            return;
        }catch (Exception e){
            System.out.println("Invalid");
        }
        finally {
            System.out.println("finally block");
            System.out.println("Main ends");
        }
    }
}
