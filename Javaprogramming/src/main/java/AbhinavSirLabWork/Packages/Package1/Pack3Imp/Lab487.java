package AbhinavSirLabWork.Packages.Package1.Pack3Imp;
import AbhinavSirLabWork.Packages.Package1.Pac2Imp.Hello;

public class Lab487 {
    public static void main(String[] args) {
     Hai hai=new Hai();
     hai.Show();
    }

}
class Xyz extends Hello{}
class Hai extends Hello{
    void Show(){
        System.out.println("Hai------show()");
        Hello obj1=new Hello();
       // System.out.println(obj1.x);
        Xyz obj2=new Xyz();
       // System.out.println(obj2.x);
    }
}