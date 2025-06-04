package Abstract;

public class Dragon {
    public static void main(String[] args) {
      B obj1=new B();
      obj1.area();
    }
}
abstract class A{
abstract void area();
}
class B extends A{

    @Override
    void area() {
        System.out.println("This is implementation method of abstract method");
    }
}
