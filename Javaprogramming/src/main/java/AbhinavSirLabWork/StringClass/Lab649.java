package StringClass;

public class Lab649 {
    public static void main(String[] args) {
        String str="JLCINDIA";
        char ch[] =str.toCharArray();
        System.out.println(ch);
        System.out.println("\n** char array**");
        for (int i=0;i<ch.length;i++){
            char ch1=ch[i];
            System.out.println(ch1);
        }
    }
}
