package AbhinavSirLabWork.Exception;

public class Lab731 {

    public static void main(String[] args) {
        System.out.println("Main started");
   try {
       new A().Co();
   }catch (Exception e){
       System.out.println("catch block");
       System.out.println("Reason : "+e);
       System.out.println("Message: "+e.getMessage());
       System.out.println("Cause : "+e.getCause());
       System.out.println();
        e.printStackTrace();
   }
    }
}
class How{

    void Bo(){
        System.out.println("Bo method starts");
        new A().Co();
    }
}
class A{
     void Co(){
         System.out.println("Co method starts");
         new B().Do();
     }
}
class B{
void Do(){
    System.out.println("Do method starts");
    new C().Go();
}
}
class C{
    void Go(){
        System.out.println("Go method starts");
    int x=10/0;
        System.out.println("Go method ends");
}}
