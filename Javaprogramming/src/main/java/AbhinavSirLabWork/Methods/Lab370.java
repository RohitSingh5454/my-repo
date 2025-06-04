package AbhinavSirLabWork.Methods;

public class Lab370 {
    public static void main(String[] args) {
        Copter c1=new Copter();
        c1.Show(33);
    }
}
class Copter{
    boolean Show(int v){
        System.out.println("Show() method");
       // return 0;  -----Incompatibles types
        return false;
    }
}
