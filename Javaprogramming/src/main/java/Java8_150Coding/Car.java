package Java8_150Coding;

public interface Car {
    default void Show1(){
        System.out.println("This is solving car class");
    }
}
 interface Mercedes extends Car{
    default void Show1(){
        System.out.println("This is Mercedes class");
    }
}
class Bike implements Mercedes,Car{
    @Override
    public void Show1() {
        System.out.println("This is my Bike class");
    }
}
class Scooter extends Bike implements Mercedes,Car{
    public static void main(String[] args) {
        new Scooter().Show1();
    }
}
