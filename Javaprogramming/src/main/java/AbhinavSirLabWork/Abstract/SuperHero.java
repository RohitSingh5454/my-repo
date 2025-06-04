package Abstract;

public class SuperHero {
    public static void main(String[] args) {

    }
}
abstract class Superman{
    abstract void Fly();
}
abstract class Batman extends Superman{
    void Sleeping(){
        System.out.println("Batman->Sleeping");
    }
}

