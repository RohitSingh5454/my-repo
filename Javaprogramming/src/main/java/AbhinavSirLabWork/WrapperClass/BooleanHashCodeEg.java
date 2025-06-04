package WrapperClass;

public class BooleanHashCodeEg {
    public static void main(String[] args) {
        Boolean b1=Boolean.TRUE;
        Boolean b2=Boolean.FALSE;
        System.out.println(b1.hashCode());
        System.out.println(b2.hashCode());
        System.out.println(b1.hashCode()==b2.hashCode());
    }
}
