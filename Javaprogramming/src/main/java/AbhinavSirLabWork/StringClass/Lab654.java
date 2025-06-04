package StringClass;

public class Lab654 {
    public static void main(String[] args) {
        String str="JLC,Java Learning center.No1 in Java training and placement.Java is a popular language ";
        String str1[]=str.split("Java");
        System.out.println(str1);
        for (int i=0;i<str.length();i++){
            String st=str1[i];
            System.out.println(i+"\t"+st);
        }
    }
}
