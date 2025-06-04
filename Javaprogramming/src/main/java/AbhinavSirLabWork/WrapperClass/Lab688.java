package AbhinavSirLabWork.WrapperClass;

public class Lab688 {
    public static void main(String[] args) {
        Service1 serve=new Service1();
        byte b=23;
       // byte c=34;
        serve.show(b);
    }
}

class Service1{
    void show(byte ab,byte bc){
        System.out.println("\n-show(byte,byte)");
    }
    void show(byte...ab){

        System.out.println("\n-show(byte)");
    }
}