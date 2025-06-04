package AbhinavSirLabWork.Methods.Overloading;

public class Lab388 {
    public static void main(String[] args) {
       How obx=new How();
       byte b=44;
       obx.add(b,22);
       obx.add(22,b);
    }
}
class How{
    void add(byte a,int b){
        System.out.println("add(byte,int)");
    }
    void add(int a,byte b){
        System.out.println("add(int,byte)");
    }
}
