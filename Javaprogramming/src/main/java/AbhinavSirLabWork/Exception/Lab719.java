package AbhinavSirLabWork.Exception;

public class Lab719 {
    public static void main(String[] args) {
        try {


            int x = 10 / 0;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception caught");
        }
        System.out.println("Main ends");
    }
}
