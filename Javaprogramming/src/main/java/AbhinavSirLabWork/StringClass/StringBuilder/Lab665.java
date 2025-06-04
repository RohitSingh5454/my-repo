package AbhinavSirLabWork.StringClass.StringBuilder;

public class Lab665 {
    public static void main(String[] args) {
        String str="JLC";
        StringBuilder sb1=new StringBuilder("JLC");
        System.out.println(str.hashCode());
        System.out.println(sb1.hashCode());
        System.out.println(str.contentEquals(sb1));
    }
}
