package AbhinavSirLabWork.StringClass;

public class Lab637_638both {
    public static void main(String[] args) {
        String str="Intelligent Investor is marketting guru";
        System.out.println(str.startsWith("Intelligent"));
        System.out.println(str.startsWith("Investor"));
        System.out.println(str.endsWith("guru"));
        System.out.println(str.startsWith("Investor",12));
    }
}
