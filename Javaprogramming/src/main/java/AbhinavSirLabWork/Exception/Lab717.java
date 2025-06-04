package AbhinavSirLabWork.Exception;

public class Lab717 {
    public static void main(String[] args) {
        System.out.println("Main started");
        String s1=null;
        try {

            System.out.println(s1);
            s1=args[1];

        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBound Exception caught");
        }
        int x=0;
        try {
            x=Integer.parseInt(s1);
        }
        catch (NumberFormatException e){
            System.out.println("Number format exception caught");
        }
        try {
            int res=10/0;
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic exception caught");
        }
    }
}
