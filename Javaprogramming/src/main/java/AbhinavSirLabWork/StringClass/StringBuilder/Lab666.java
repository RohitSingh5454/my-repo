package StringClass.StringBuilder;

public class Lab666 {
    public static void main(String[] args) {
        StringBuilder sbd=new StringBuilder("JLC");
        StringBuilder sbdm=new StringBuilder("JLC");

        System.out.println(sbd==sbdm);
        System.out.println(sbd.equals(sbdm));
        String str1=sbd.toString();
        String str2=sbdm.toString();
        System.out.println(str1.equals(str2));
    }
}
