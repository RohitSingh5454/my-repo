package Super;

public class Boom {
    public static void main(String[] args) {
        new Spo(14);
    }
}
class Bpo{
    Bpo(){
        System.out.println("This is no argument constructor");
    }

}
class Spo extends Bpo{
    Spo(){
        System.out.println("This is Bp no arg constructor");
    }
    Spo(int b){
        this();
        System.out.println("This is 1-arg constructor");

    }
}
