package AbhinavSirLabWork.Exception;

public class Lab711 {
    public static void main(String[] args) {
        System.out.println("Main started");
      try {
          String str = args[0];
          int y=Integer.parseInt(str);
          System.out.println(str);
          int i=10/y;
      }
      catch (ArithmeticException e){
          System.out.println("Arithmetic Exception occur");
      }
            catch (NullPointerException e){
                System.out.println("Null pointer exception occur");
            }
      catch (ArrayIndexOutOfBoundsException e){
          System.out.println("Array index out of bound exception occur");
      }

    }
}
