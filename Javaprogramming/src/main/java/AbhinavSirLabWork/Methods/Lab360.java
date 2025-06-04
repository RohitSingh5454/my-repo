package AbhinavSirLabWork.Methods;

public class Lab360 {
    public static void main(String[] args) {
        Hi obx=new Hi();
       int b= obx.Get(34);
        System.out.println(b);
    }
}
class Hi{
    int Get(int x){
        return x+1;
    }
}
