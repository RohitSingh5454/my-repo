package AbhinavSirLabWork.Oops.InheritanceAndBlock;

public class Lab433 {
    public static void main(String[] args) {
        new Daemon();
    }
}
class Kill{
    int a=99;
    {
        System.out.println("Kill->I.B "+a);
    }

}
class Daemon extends Kill{
    int b=78;
    {
        System.out.println("Daemon->I.B "+a);
        System.out.println("Daemon->I.B "+b);
    }
}
