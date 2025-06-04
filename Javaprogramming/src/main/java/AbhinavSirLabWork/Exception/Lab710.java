package AbhinavSirLabWork.Exception;

public class Lab710 {
    public static void main(String[] args) {
        System.out.println("Main started");
        try {
        String data=args[0];
        int i=Integer.parseInt(data);
        int res=10/i;
            System.out.println("result is : "+res);
        }
        catch (Exception e){
            System.out.println("Enter the proper value");
        }
        System.out.println("Main completed");
    }
}
