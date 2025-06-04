package AbhinavSirLabWork.InfosysInterviewPreparation;

public interface functionInterface {
   public void xyz(int y);
    default void getData(){
        System.out.println("Hello world");
    }

    public static void main(String[] args) {
        functionInterface ob1=(int x)-> System.out.println(2*x);
        ob1.xyz(23);
    }
}
