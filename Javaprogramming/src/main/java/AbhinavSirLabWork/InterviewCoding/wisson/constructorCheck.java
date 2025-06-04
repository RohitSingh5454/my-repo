package AbhinavSirLabWork.InterviewCoding.wisson;

public class constructorCheck {
    constructorCheck(){
        this("Hello");
        System.out.println("This is parent1 constructor");
    }
    constructorCheck(String s){
        System.out.println("This is parent 2 const");
    }
}
class Xyz extends constructorCheck{
    Xyz(){
        System.out.println("This is child constructor");
    }
    Xyz(String s){
        System.out.println("Child parameter constructor");
    }

    public static void main(String[] args) {
        Xyz ob=new Xyz();
    }

}