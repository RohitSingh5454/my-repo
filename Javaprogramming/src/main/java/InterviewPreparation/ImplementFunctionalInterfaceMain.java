package InterviewPreparation;

public interface ImplementFunctionalInterfaceMain {
    public int abc(int x);
}

class Xyz1{
    public static void main(String[] args) {
        ImplementFunctionalInterfaceMain imp=(x)->x*x;
       int square= imp.abc(23);
        System.out.println(square);

    }
}
