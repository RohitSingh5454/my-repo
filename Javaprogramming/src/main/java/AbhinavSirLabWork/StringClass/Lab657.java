package StringClass;

public class Lab657 {
    public static void main(String[] args) {
        String ecp="[A-Z]";
        String bix="[A-Z, a-z, 0-9]";
        char ch[]=ecp.toCharArray();
        System.out.println(ecp);
        System.out.println("H".matches(ecp));
        System.out.println("I".matches(ecp));
        System.out.println("K".matches(ecp));
        System.out.println("SRINIVAS".matches(ecp));
        System.out.println("SRINIVA".matches(bix));

    }
}
