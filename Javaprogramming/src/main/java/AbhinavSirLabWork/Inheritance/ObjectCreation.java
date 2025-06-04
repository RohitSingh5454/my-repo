package Inheritance;

public class ObjectCreation {
    public static void main(String[] args) {
        new XYZ();

    }
}
class PQR{
   static int a=07;
}
class XYZ extends PQR{
   static int b=56;
   {
        System.out.println(a);
        System.out.println(b);
    }
}
