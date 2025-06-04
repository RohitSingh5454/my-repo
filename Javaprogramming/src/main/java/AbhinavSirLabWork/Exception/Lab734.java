package AbhinavSirLabWork.Exception;

public class Lab734 {
    public static void main(String[] args) {
        try {
            int res=10/0;
        }catch (NullPointerException e){
            System.out.println("Exception caught");
        }
    }
}
