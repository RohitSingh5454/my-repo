package AbhinavSirLabWork.Exception;

public class Lab715 {
    public static void main(String[] args) {
        System.out.println("Main started");
        try {
            int res=10/0;
            System.out.println(res);
        }
       // System.out.println();//Not possible
        catch (Exception e){
        System.out.println("JLC");

    }
        System.out.println("Main completed");
    }
}
