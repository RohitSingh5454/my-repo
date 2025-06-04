package AbhinavSirLabWork.Exception;

public class Lab714 {
    public static void main(String[] args) {
        System.out.println("Main started");
        try {
            int res=10/0;
            System.out.println(res);
        }
        catch (NumberFormatException e){
            System.out.println("Number format exception occur");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bound exception occur");
        }
        System.out.println("main completed");
    }
}
