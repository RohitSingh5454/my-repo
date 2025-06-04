package StringClass;

public class Lab662 {
    public static void main(String[] args) {
        String str="Jlc India is the best Learning platform";
        String str1="Java is the best programming language in India";
        System.out.println(str1.length());
        boolean b=str.regionMatches(1,str1,4,55);
        System.out.println(b);
    }
}
