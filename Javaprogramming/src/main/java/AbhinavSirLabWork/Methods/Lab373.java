package AbhinavSirLabWork.Methods;

public class Lab373 {
    public static void main(String[] args) {
         Bptu obj1=new Bptu();
         //obj1.isDigit('E');
        System.out.println(obj1.isDigit('C'));
    }
}
class Bptu{
 boolean isDigit(char ch){
     System.out.println("isDigit() method");
     if (ch>=65 && ch<=88){
         return true;
     }
     else {
         return false;
     }
 }

}
