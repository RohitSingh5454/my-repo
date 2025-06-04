package Inheritance;

public class UsingConstructor {
    public static void main(String[] args) {

    }
}
class MP{
    MP(){
        System.out.println("This is MP constructor");
    }

}
class MLA extends MP{
    MLA(){
        System.out.println("This is MLA constructor");
    }
}
class CM extends MLA{
    CM(){
        System.out.println("This is CM constructor");
    }
}