package AbhinavSirLabWork.Singleton;

public class Lab703 {
    public static void main(String[] args) {
        Hello h=Hello.getIn();
        System.out.println(h);
        System.out.println(Hello.getIn());
        System.out.println(Hello.getIn());
    }
}
class Hello{
    private static Hello in=null;
    static  {
        in=new Hello();
    }
     private Hello(){

    }
    public static Hello getIn(){
        return in;
    }
}