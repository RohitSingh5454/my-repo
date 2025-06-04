package AbhinavSirLabWork.Methods.Overloading;

public class Lab392 {
    public static void main(String[] args) {
      Pop ob=new Pop();
     // ob.Show(null);    -------Ambigous error
    }
}
class Pop{
    void Show(String str1){
        System.out.println("Show(String)");
    }
    void Show(Pop p){
        System.out.println("Show(Pop)");
    }
}
