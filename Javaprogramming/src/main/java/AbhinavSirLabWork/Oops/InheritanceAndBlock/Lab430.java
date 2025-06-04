package AbhinavSirLabWork.Oops.InheritanceAndBlock;

public class Lab430 {
    public static void main(String[] args) {
        System.out.println(FireNow.b);
        System.out.println(FireNow.a);
    }
}
class HireNow{
  static int a=91;
    static {
        System.out.println("hireNow-> S.B");
    }
}
class FireNow extends HireNow{
    static int b=98;
    static {
        System.out.println("Hello->S>B");
    }
}
