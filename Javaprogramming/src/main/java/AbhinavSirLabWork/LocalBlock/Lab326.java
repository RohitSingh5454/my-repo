package AbhinavSirLabWork.LocalBlock;

public class Lab326 {
    public static void main(String[] args) {
        System.out.println("I am main");

        {
           int a=98;
            System.out.println("I am local block 1 in main "+a);
        }
        {
            int a=78;
            System.out.println("I am local block 2 in main "+a);
        }
        {
            String a="Str";
            System.out.println("I am local block 3 in main "+a);
        }
    }
}
