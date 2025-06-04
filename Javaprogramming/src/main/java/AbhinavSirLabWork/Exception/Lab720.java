package AbhinavSirLabWork.Exception;

public class Lab720 {
    public static void main(String[] args) {
        System.out.println("main started");
        try {
            int x=10/0;
        }catch (NullPointerException e){
            System.out.println("Exception caught");
        }
        System.out.println("print data");
       /* finally {
            System.out.println("This us finally block");
        }*/
        System.out.println("main ends");
    }
}
