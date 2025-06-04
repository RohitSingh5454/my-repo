package AbhinavSirLabWork.Methods.Overloading;

public class Lab383 {
    public static void main(String[] args) {
        Student str=new Student();
        int ab= str.Box(23,25);
        System.out.println(ab);
        String st= str.Box("Ko","No");
        System.out.println(st);

    }
}
class Student {
    int Box(int a, int b) {
        System.out.println("Box()");
        return  a+b;
    }

    String Box(String c, String d) {
       System.out.println("Box()");
        return c+d;
    }



}