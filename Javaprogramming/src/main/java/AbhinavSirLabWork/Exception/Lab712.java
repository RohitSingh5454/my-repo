package AbhinavSirLabWork.Exception;

public class Lab712 {
    public static void main(String[] args) {
        System.out.println("Main start");
        try {
            String st1=args[0];
            int x=Integer.parseInt(st1);
            int res=10/x;
            System.out.println(res);
        }
        catch (Exception e){
            System.out.println("Exception occur");
        }
       /* catch (ArrayIndexOutOfBoundsException e)  // error occured as exception is already caught
        {
            System.out.println();
        }*/
    }
}
