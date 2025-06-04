package AbhinavSirLabWork.Singleton;

public class ExampleSinglton {
    public static void main(String[] args) {

        Hero h2=Hero.getIns();
        Hero h3=Hero.getIns();

        System.out.println(h2);
        System.out.println(h3);


    }
}
class Hero{
    private static Hero Ins=new  Hero();
    private Hero(){

    }
    public static Hero getIns(){

        return Ins;
    }

}
