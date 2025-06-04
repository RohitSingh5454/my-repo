package AbhinavSirLabWork.Singleton;

public class Lab705 {
    public static void main(String[] args) {
        Hum h1=Hum.getINS();
        System.out.println(h1);
        System.out.println(Hum.getINS());
        Hum h2=(Hum)h1 .clone();
        System.out.println(h2);
        Hum h3=Hum.getINS();
        System.out.println(h3);
    }
}
class Hum implements Cloneable{
    private static Hum INS=new Hum();
    private Hum(){

    }
    public static Hum getINS(){
        return INS;
    }
    public Object clone(){
        return this;
    }
}