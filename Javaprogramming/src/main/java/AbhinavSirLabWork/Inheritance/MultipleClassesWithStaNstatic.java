package Inheritance;

public class MultipleClassesWithStaNstatic {
    public static void main(String[] args) {
        new BJP();
    }
}
class AAP{
    AAP(){
        System.out.println("This is aap constructor");
    }
    static {
        System.out.println("This is aap class");
    }
    {
        System.out.println("This is Aap sarkaar");
    }

}
class TMC extends AAP{
    TMC(){
        System.out.println("This is Tmc constructor");
    }
    static {
        System.out.println("This is TMC class");
    }
    {
        System.out.println("This is Tmc sarkaar");
    }
}
class BJP extends TMC{
    BJP(){
        System.out.println("This is Bjp constructor");
    }
    static {
        System.out.println("Thius is Bjp class");
    }
    {
        System.out.println("This is Bjp sarkaar");
    }
}
