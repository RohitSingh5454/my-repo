package AbhinavSirLabWork.Singleton;

public class Lab702 {
    public static void main(String[] args) {
        Hi h1=Hi.getHi1();
        System.out.println(h1);
        System.out.println(Hi.getHi1());
        System.out.println(Hi.getHi1());

    }
}
class Hi{
     Hi(){

    }
    public static Hi getHi=new Hi();
    public static Hi getHi1(){
        return new Hi();
    }
}
