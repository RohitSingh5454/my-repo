package StringClass.StringBuffer;

public class Check {
    public static void main(String[] args) {
        StringBuffer sbf=new StringBuffer("Don");
        StringBuffer sbft=new StringBuffer("Don");
        String strp="JLC";
        String strt=args[0];
        System.out.println(sbf==sbft);
        System.out.println(sbf.equals(sbft));
        String str=sbf.toString();
        String str1=sbft.toString();
        System.out.println(str1==str);
        System.out.println(str.equals(str1));
        System.out.println(strt);
    }
}
