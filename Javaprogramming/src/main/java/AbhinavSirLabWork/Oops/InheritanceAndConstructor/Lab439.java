package AbhinavSirLabWork.Oops.InheritanceAndConstructor;

public class Lab439 {
    public static void main(String[] args) {
        new Two();
    }
}
class Zero{
    Zero(){
        System.out.println("Zero->DC");
    }
    static {
        System.out.println("Zero->S.B");
    }
    {
        System.out.println("Zero->I.B");
    }
}
class One extends Zero{
    One(){
        System.out.println("One->DC");
    }
    static {
        System.out.println("One->S.B");
    }
    {
        System.out.println("One->I.B");
    }
}
class Two extends One{
    Two(){
        System.out.println("Two-DC");
    }
    static {
        System.out.println("Two->S.B");
    }
    {
        System.out.println("Two->I.B");
    }
}
