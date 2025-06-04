package AbhinavSirLabWork.StringClass;

public class Lab639 {
    public static void main(String[] args) {
        String str="Hi , welcome to Jlc(Java learning center),Java ";
        String str1=str.replaceFirst("Java","Pom");
        System.out.println(str1);
        String str2=str.replaceAll("Java","Spring boot");
        System.out.println(str2);
    }
}
