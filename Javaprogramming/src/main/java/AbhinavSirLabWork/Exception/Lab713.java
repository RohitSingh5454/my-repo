package AbhinavSirLabWork.Exception;

public class Lab713 {
    public static void main(String[] args) {
        System.out.println("Main started");
        try {
            String str1=args[0];
            int x=Integer.parseInt(str1);
            int res=10/x;
            System.out.println(res);
        }
        catch (NullPointerException e){
            System.out.println("Null pointer exception occur");
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic exception occur");
        }
        catch (NumberFormatException e)
        {
            System.out.println("A exception occur");
        }
        catch (Exception e){
            System.out.println("Exception occur");
        }
    }
}
