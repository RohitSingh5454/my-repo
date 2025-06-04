package StringClass;

public class Implement {
    public static void main(String[] args) {
        String str="Bibha";
        String str1="Sekhawat";
        String str2=new String("Bibha");
        String str3=str2.intern();
        System.out.println(str==str3);
    }
}
