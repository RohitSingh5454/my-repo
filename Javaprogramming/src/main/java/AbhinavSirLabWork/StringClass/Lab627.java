package StringClass;

public class Lab627 {
    public static void main(String[] args) {
        String str=new String("Charcoal");
        String str1=new String("Charcoal");
        String str3=new String("CHARCOAL");
        String str2=new String("Budwiser");
        System.out.println(str+"\t"+str1+"\t"+str2);
        System.out.println(str==str1);
        System.out.println(str3.equals(str1));
        System.out.println(str.equalsIgnoreCase(str3));
    }
}
