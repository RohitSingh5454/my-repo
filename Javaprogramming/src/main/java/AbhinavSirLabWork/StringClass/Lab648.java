package StringClass;

public class Lab648 {
    public static void main(String[] args) {
        String str1="My India";
        System.out.println( str1.charAt(1));
        System.out.println(str1.charAt(2));
        System.out.println("----------------");

        for (int i=0;i<str1.length();i++){
            System.out.println(i+"\t"+str1.charAt(1));
        }
    }
}
