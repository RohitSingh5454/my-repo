package AutoBoxing;

public class Lab685 {
    public static void main(String[] args) {
          Services obj1=new Services();
          byte b1=11;
          byte b2=25;
         // obj1.Ser(121,126);
          //obj1.Ser(23,45);
          obj1.Ser(b1,b2);
    }
}
class Services{
    void Ser(int a,int b){
        System.out.println("\n->show(int int)");
    }
   void Ser(byte c,byte d){
        System.out.println("\n->show(byte byte)");
    }
    void Ser(Byte x,Byte y){
        System.out.println("\n->show(Byte Byte)");
    }
}
