package AbhinavSirLabWork.Exception;

public class Lab721 {
    public static void main(String[] args) {
     try {
            int x=10/0;
         System.out.println(x);
         return;
     }
     catch (Exception e){
    System.out.println("Invalid");
}    finally {
        System.out.println("Main ends");
    }
}}
