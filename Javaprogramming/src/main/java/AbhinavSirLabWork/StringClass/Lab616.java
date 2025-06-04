package AbhinavSirLabWork.StringClass;

public class Lab616 {
    public static void main(String[] args) {
        String str1="Jlc";
        String str2=new String("Jlc");
        String str3=str2.intern();
        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str2==str3);
        System.out.println("-------------");
        String str4="OK";
        String str5="OK";
        System.out.println(str4==str5);
    }
}
