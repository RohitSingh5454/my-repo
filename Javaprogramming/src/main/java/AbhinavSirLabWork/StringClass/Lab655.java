package StringClass;

public class Lab655 {
    public static void main(String[] args) {
        String str="JLC,Java Learning center.No1 in Java training and placement.Java is a popular language ";
        String str1[]=str.split("Java");
        System.out.println(str1);
        System.out.println(str.length());
        System.out.println(str1.length);
        String str3[]=str.split("Java",1);
        System.out.println(str3.length);
        for (int i=0;i<str1.length;i++) {
            String str2 = str1[i];
            System.out.println(str2);
        }

       for (int i=0;i<str3.length;i++){
           String st4=str3[i];
           System.out.println(st4);
       }

    }
}
