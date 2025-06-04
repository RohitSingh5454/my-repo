package ObjectClass;

public class Lab606 {


    public static void main(String[] args) {

        String str1 = new String("Raghav");
        String str2 = new String("Raghav");
        String str3 = new String("Raghav");
        System.out.println(str1==str2);
        System.out.println(str2==str3);
        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));
    }
}
