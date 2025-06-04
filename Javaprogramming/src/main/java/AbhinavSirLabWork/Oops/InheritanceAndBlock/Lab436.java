package AbhinavSirLabWork.Oops.InheritanceAndBlock;

public class Lab436 {
    public static void main(String[] args) {
        Sixter sixter=new Sixter();
        sixter.show();
    }
}
class Hixter{
   static void show(){
        System.out.println("Hai->show");
    }
    static  {
        System.out.println("Hixter->S.B");
    }
}
class Sixter extends Hixter{
    static {
        System.out.println("Sixter->S.B");
    }

}
