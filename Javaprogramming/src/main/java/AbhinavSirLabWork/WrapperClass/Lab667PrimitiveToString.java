package AbhinavSirLabWork.WrapperClass;

public class Lab667PrimitiveToString {
    public static void main(String[] args) {
        int a=345;
       // String str1=a;   -----error
      //  String str=(String)a;
        String str2=a+" ";
        String str3=" "+a;
        System.out.println(String.valueOf(a));
        System.out.println(Integer.toString(a));

    }
}
