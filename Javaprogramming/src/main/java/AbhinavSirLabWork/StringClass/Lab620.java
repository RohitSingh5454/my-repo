package AbhinavSirLabWork.StringClass;

public class Lab620{
    public static void main(String[] args) {
        String str1="JlcIndia";
        String str2="Jlc"+"India";
        final String str3="Jlc";
        final String str4="India";
        String str5=str3+str4;
        System.out.println(str1==str2);
        System.out.println(str1==str5);
    }
}
