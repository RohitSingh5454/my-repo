package AbhinavSirLabWork.Singleton;

public class Lab704 {
    public static void main(String[] args) {
        Xerox x1=Xerox.getINS();
        System.out.println(x1);
        System.out.println(Xerox.getINS());
        System.out.println(Xerox.getINS());
    }
}
class Xerox{
     private static Xerox INS=null;
     private Xerox(){

     }
     public static Xerox getINS(){
         if (INS==null){
             INS=new Xerox();
             return INS;
         }
         else {
         return null;
     }
}}
