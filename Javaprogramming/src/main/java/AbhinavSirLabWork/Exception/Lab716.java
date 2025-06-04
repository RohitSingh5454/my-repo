package AbhinavSirLabWork.Exception;

public class Lab716 {
    public static void main(String[] args) {
        try {
            int x=10/0;
        }catch (NullPointerException e){
            System.out.println("Exception caught");
        }
       // System.out.println("Invalid input");
        catch (Exception e){
            System.out.println("Exception caught2");
        }
        System.out.println("main completed");
    }
}
