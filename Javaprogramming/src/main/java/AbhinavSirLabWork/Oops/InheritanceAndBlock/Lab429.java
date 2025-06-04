package AbhinavSirLabWork.Oops.InheritanceAndBlock;

public class Lab429 {
    public static void main(String[] args) {
        new Shade();
    }
}
class Joker{
    static int a=89;
    static {
        System.out.println("Joker->sb "+a);
    }
}
class Shade extends Joker{
    static int b=56;
    static {
        System.out.println("Hello->Sb "+a);
        System.out.println("Hello->Sb "+b);
    }
}
