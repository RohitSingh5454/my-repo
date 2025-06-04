package AbhinavSirLabWork.Packages.Package1.Pack3Imp;

public class Lab490 {
    public static void main(String[] args) {
        Hero op=new Hero(34);
       op.Fox();
    }
}
class Hero{
    private int q;
    public Hero(int q){
        this.q=q;
    }
    void Fox(){
        System.out.println(q);
    }
}