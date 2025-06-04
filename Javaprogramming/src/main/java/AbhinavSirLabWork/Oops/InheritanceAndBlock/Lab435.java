package AbhinavSirLabWork.Oops.InheritanceAndBlock;

public class Lab435 {
    public static void main(String[] args) {
        System.out.println("Lab435->S.B");
    }
    static {
        System.out.println("S.B");
    }
}
class Splunk extends Lab435{

    static {
        System.out.println("Splunk->S.B");
    }
}