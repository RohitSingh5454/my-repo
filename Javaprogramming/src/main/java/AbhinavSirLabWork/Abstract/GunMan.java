package AbhinavSirLabWork.Abstract;

public class GunMan {
    public static void main(String[] args) {
        System.out.println(SniperMan.a);
      SniperMan.show();


}}
abstract class SniperMan{
   static int a=89;
   static void show(){
        System.out.println("Hello->show");
    }
}
