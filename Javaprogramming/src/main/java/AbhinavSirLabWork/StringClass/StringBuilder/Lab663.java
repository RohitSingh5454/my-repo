package AbhinavSirLabWork.StringClass.StringBuilder;

public class Lab663 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        System.out.println("Result is : "+sb.capacity());
        System.out.println(sb.length());
        sb.trimToSize();
        System.out.println("Capacity : "+sb.capacity());
        System.out.println(sb.length());


    }
}
