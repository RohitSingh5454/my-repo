package AbhinavSirLabWork.Design_Pattern.Singleton;

public class HelloSingleton {
    public static void main(String[] args) {
        Xyz ob=Xyz.getIns();
        System.out.println(ob);
        Xyz ob2=Xyz.getIns();
        System.out.println(ob2);
    }
}
class Xyz{
    private Xyz(){

    }
    private static Xyz Ins=new Xyz();
    public static Xyz getIns(){
        return Ins;
    }
}
