package AbhinavSirLabWork.Super;

public class Lab444 {
    public static void main(String[] args) {
        new crossJoin().show();
    }
}
class Join{
    static int a=54;
}
class crossJoin extends Join{
    static int a=67;
    public void show(){
        int a=98;
        System.out.println(a);
        System.out.println(Join.a);
        System.out.println(crossJoin.a);
    }
}