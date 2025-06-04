package StringClass;

public class Lab652 {
    public static void main(String[] args) {
        char ch[]={'J','L','C','I','N','D','I','A'};
        byte b[]={65,66,67,97,98,99,49,50};
        String str=new String(ch);
        String str1=new String(b);
        String str2=new String(b,3,4);
        System.out.println("Result is : "+str);
        System.out.println(str1);
        System.out.println("Result of byte : "+str2);
    }
}
