package AbhinavSirLabWork.ObjectClass;

public class testEquals {
    public static void main(String[] args) {
        String str="Haman";
        String str1="Haman";
        String str2="Bermandu";
        String str3=new String("Upandu");
        String str4=new String("Upandu");
       /* System.out.println(str1.hashCode());
        System.out.println(str.hashCode());*/
        System.out.println(str3.hashCode());
        System.out.println(str4.hashCode());
        /*System.out.println(str==str1);
        System.out.println(str1==str2);
        System.out.println(str3==str4);*/
        System.out.println(str.equals(str1));
    }
}
