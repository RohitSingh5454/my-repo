package AbhinavSirLabWork.Methods.Overloading;

public class Lab389 {
    public static void main(String[] args) {
       Rad obj=new Rad();
       byte b=30;
       //obj.add(b,b);  ----ambigous error
    }
}
class Rad{
    void add(byte a,int b) {
        System.out.println("add()");
    }
        void add(int a,byte b){
            System.out.println("add()");

        }
    }
