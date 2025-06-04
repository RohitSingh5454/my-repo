package AbhinavSirLabWork.WrapperClass;

public class Lab685 {
    public static void main(String[] args) {
     Service st1=new Service();
     Byte b1=12;
     Byte b2=23;
     st1.show(b1,b2);
    }
}
class Service{
    void show(int a,int b){
        System.out.println("\n-show(int ,int)");
    }
    void show(byte a,byte b) {
        System.out.println("\n-show(byte,byte)");
    }
    void show(Byte a,Byte b){
        System.out.println("\n-show(Byte,Byte)");
    }
    void show(byte...ab){
        System.out.println("\n-show(byte...ab)");

    }
}