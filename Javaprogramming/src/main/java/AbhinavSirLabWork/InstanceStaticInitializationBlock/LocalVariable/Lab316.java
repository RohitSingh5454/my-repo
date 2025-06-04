package AbhinavSirLabWork.InstanceStaticInitializationBlock.LocalVariable;

public class Lab316 {
    public static void main(String[] args) {
      Fox obj=new Fox();
      Fox obj2=new Fox();
        System.out.println(obj.a);
    }
}
class Fox{
    int a=10;

    {
        System.out.println("I.block " + a);
    }
    {
        System.out.println("I.block 2 "+a);
    }
}