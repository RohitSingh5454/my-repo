package AbhinavSirLabWork.javaConceptOfTheDay.string;

public class swapStrings {
    public static void main(String[] args) {
        String str1="Java";
        String str2="J2ee";
        System.out.println("Before swapping strings are "+str1 +" "+str2);
        String str3=str1+str2; //JavaJ2ee
        str1=str3.substring(str2.length());
        str2=str3.substring(0,str3.length()-str1.length());
        System.out.println("After swapping strings are "+str1 +" "+str2);
    }
}
