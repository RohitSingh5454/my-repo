package WrapperClass;

public class Lab672WrapperObjToString {
    public static void main(String[] args) {
        Integer in=new Integer(1234);
        String str=in.toString();
        System.out.println(in.hashCode());
        System.out.println(str.hashCode());
        Character ch=new Character('a');
        String str1=ch.toString();
        System.out.println(str1.hashCode());
        System.out.println(ch.hashCode());
        Byte b1=111;
    }
}
