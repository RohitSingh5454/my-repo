package AbhinavSirLabWork.StringClass;

public class Lab640 {
    public static void main(String[] args) {
        String str1="Welcome to jlc ,Java learning center ,No 1 in java training and placement";
        System.out.println(str1.indexOf('W'));
        StringBuffer str2=new StringBuffer("Jlc");
        StringBuffer str3=new StringBuffer("Jlc");
        String str4=str2.toString();
        String str5=str3.toString();
        System.out.println(str4.equals(str5));
        System.out.println(str2.equals(str3));
        System.out.println(str2.hashCode()+" "+str3.hashCode());
        System.out.println(str4.hashCode()+" "+str5.hashCode());
        str2.append("India");
        System.out.println(str2);

    }
}
