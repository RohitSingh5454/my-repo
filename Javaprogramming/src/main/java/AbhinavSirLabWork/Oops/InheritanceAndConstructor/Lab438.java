package AbhinavSirLabWork.Oops.InheritanceAndConstructor;

public class Lab438 {
    public static void main(String[] args) {
        new Z();
    }
}
class X{
    X(){
        System.out.println("X->D.C");
    }
}
class Y extends X{
    Y(){
        System.out.println("Y->D.C");
    }
}
class Z extends Y{
    Z(){
        System.out.println("Z->D.C");
    }
}