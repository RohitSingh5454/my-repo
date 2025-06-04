package AbhinavSirLabWork.Class;

public class StaticNonStatic {
    int num=94;
    static int num2=55;
    public static void Get(){
        num2++;
        System.out.println(num2);
    }
    public void Show(){
        num2++;
        num++;
    }

    public static void main(String[] args) {
        StaticNonStatic.num2=77;
        System.out.println(StaticNonStatic.num2);
        StaticNonStatic obj1=new StaticNonStatic();
        obj1.num=67;
    }

}
