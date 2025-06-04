package AbhinavSirLabWork.WrapperClass;

public class Lab670WrapperToPrimitive {
    public static void main(String[] args) {
        Integer in=new Integer(1234);
        int a=in.intValue();
        System.out.println(a);
        Character chr=new Character('A');
        char ch=chr.charValue();
        System.out.println(ch);
        Byte b1=new Byte("122");
        System.out.println(b1);
        byte b2=b1.byteValue();
        System.out.println(b2);
    }
}
