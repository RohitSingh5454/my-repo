package StringClass;

public class Lab623 {
    public static void main(String[] args) {
        String str1="JLC";
        String str2="INDIA";
        String str3="JLCINDIA";
        String str4=str1.concat(str2);
        System.out.println(str4);
        System.out.println(str4==str3);
        System.out.println(str4.equals(str3));

    }
}
