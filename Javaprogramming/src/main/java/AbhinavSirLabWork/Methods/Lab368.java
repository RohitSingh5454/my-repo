package AbhinavSirLabWork.Methods;

public class Lab368 {
    public static void main(String[] args) {
    Loc ox=new Loc();
        //System.out.println(ox.Show(66));
        System.out.println(ox.Show(12));
    }
}
class Loc{

    long Show(int x){
        System.out.println("Show() method");
        return x+4;
    }
}
