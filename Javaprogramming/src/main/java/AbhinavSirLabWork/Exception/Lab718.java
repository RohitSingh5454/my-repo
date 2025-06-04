package AbhinavSirLabWork.Exception;

public class Lab718 {
    public static void main(String[] args) {
        try {


        String str=args[0];
        int y=Integer.parseInt(str);
        int res=10/y;
        int x=10/0;
        }catch (Exception e){
                      // catch (ArrayIndexOutOfBoundsException  | ArrayIndexOutOfBoundsException | ArrayIndexOutOfBoundsException e){
           System.out.println("Exception caught");}


    }
}
