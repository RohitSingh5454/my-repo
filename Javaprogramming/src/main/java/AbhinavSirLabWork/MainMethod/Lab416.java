package AbhinavSirLabWork.MainMethod;

public class Lab416 {
    public static void main(String[] args) {
        System.out.println("Hello main");
    }
}
class Go{
    public static void main(String[] args) {
        System.out.println("Go main");
        Lab416.main(args);
    }
}
