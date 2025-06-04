package AbhinavSirLabWork.Abstract;

public abstract class Example {
    abstract void Animal();
    void Human(){
        System.out.println("Human is ommnivores");
    }
}
class cat extends Example{

    @Override
    void Animal() {
        System.out.println("Animal is running");
    }
}
class mainExample{
    public static void main(String[] args) {
        cat ob1=new cat();
        Example oc1=new cat();


        ob1.Animal();
        ob1.Human();
    }
}